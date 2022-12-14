class Solution {
public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<String>();
            for(String word: words){
             if(isPatternMatch(word, pattern))
                 list.add(word);
         }
        return list;
    }
    
    
    private boolean isPatternMatch(String word, String pattern){
      HashMap<Character, Character> map = new HashMap<>();
      if(word.length()!=pattern.length()) return false;
      for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
             if (map.get(pattern.charAt(i))!=word.charAt(i)) return false;
             }  else if(map.containsValue(word.charAt(i))) return false;
            map.put(pattern.charAt(i), word.charAt(i));
        }
         return true;
    }
}