class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" "); // -> apple apple banana banana to array

        HashMap<Character, String> map = new HashMap<>();

        if(sArr.length!= pattern.length()) {
            return false;
        }

        for(int i=0; i<sArr.length; i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(sArr[i])) {
                    return false;
                }
            } else {
                if(map.containsValue(sArr[i])) {
                    return false;
                }

                map.put(c, sArr[i]);
            }
        }

        return true;
    }
}