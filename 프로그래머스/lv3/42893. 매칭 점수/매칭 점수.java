import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.MatchResult;
import java.util.stream.Collectors;

class Solution {
     public int solution(String word, String[] pages) {
        Pattern targetWordPattern = Pattern.compile("(?<=[^a-zA-Z])" + word + "[^a-zA-Z]", Pattern.CASE_INSENSITIVE);
        Pattern currentPageURLPattern = Pattern.compile("<meta property=\"og:url\" content=(\"https://\\S*\")/>");
        Pattern externalLinkPattern = Pattern.compile("<a href=(\"https://\\S*\")>");
        List<String> urls = new ArrayList<>();
        Map<String, MetaInfo> metaInfoMap = new HashMap<>();
        int index = 0;
        for (String page : pages) {
            page = page.toLowerCase();
            int basicScore = (int)targetWordPattern
                    .matcher(page)
                    .results()
                    .map(MatchResult::group)
                    .count();

            String currentURL = currentPageURLPattern
                    .matcher(page)
                    .results()
                    .map(m -> m.group(1))
                    .collect(Collectors.joining());

            List<String> result = externalLinkPattern
                    .matcher(page)
                    .results()
                    .map(m -> m.group(1))
                    .collect(Collectors.toList());
            metaInfoMap.put(currentURL, new MetaInfo(index, basicScore, result));
            urls.add(currentURL);
            index++;
        }

        for (String url : urls) {
            MetaInfo metaInfo = metaInfoMap.get(url);
            List<String> extLinks = metaInfo.links;
            for (String extLink : extLinks) {
                if (metaInfoMap.containsKey(extLink)) {
                    metaInfoMap.get(extLink).addTotalScore(metaInfo);    
                }
            }
        }

        double max = 0;
        int answer = 0;
        for (String url : urls) {
            double total = metaInfoMap.get(url).totalScore;
            if (max < total) {
                max = total;
                answer = metaInfoMap.get(url).index;
            }
        }
        return answer;
    }

    class MetaInfo {
        int index;
        double basicScore;

        double totalScore;
        List<String> links;

        public MetaInfo(int index, double basicScore, List<String> links) {
            this.index = index;
            this.basicScore = basicScore;
            this.totalScore = basicScore;
            this.links = links;
        }
        
        public void addTotalScore(MetaInfo metaInfo) {
            this.totalScore += (metaInfo.basicScore / metaInfo.links.size());
        }
    }
}