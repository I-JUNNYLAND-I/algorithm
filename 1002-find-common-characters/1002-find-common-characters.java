class Solution {
    public List<String> commonChars(String[] words) {
       String str = words[0];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int count = 1;
            for(int j = 1; j < words.length; j++)
            {
                String s = words[j];
                for(int k = 0; k < s.length(); k++)
                {
                    char c = s.charAt(k);
                    if(c == ch)
                    {
                        StringBuilder sb = new StringBuilder(s);
                        sb.setCharAt(k, '1');
                        words[j] = sb.toString();
                        count++;
                        break;
                    }
                }
            }
            
            if(count == words.length)
            {
                list.add(ch+"");
            }
            
        }
        return list;
    }
}