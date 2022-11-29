class Solution {
    public String reverseWords(String s) {
        StringBuffer result = new StringBuffer();
        String arrays[] = s.split(" ");
    
        for (int i = 0; i < arrays.length; i++) {
            StringBuffer sb = new StringBuffer(arrays[i]);
            result.append(sb.reverse().toString());
            if(i != arrays.length-1)
                result.append(" ");
        }
        
        
        return result.toString();
    }
}