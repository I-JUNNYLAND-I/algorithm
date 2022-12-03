class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        List<String> list = new ArrayList<>();
        for(String word:words)
        {
            boolean flag=true;
            HashMap<Character,Character> hmap = new HashMap<>();
            for(int i=0;i<pattern.length();i++)
            {
                char p = pattern.charAt(i);
                char c = word.charAt(i);
                if(hmap.get(p)==null)
                {
                    if(hmap.containsValue(c))
                    {
                        flag = false;
                        break;
                    }
                    hmap.put(p,c);
                }
                else if(hmap.get(p)!=c)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                list.add(word);
        }
        return list;
    }
}