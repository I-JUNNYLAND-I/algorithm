class Solution {
    public String sortSentence(String s) {
        String[] sArr = s.split(" ");
        String[] temp = new String[10];
        for(String str : sArr) {
            int len = str.length();
            System.out.println(str.substring(len - 1, len));
            int index = Integer.parseInt(str.substring(len - 1, len));
            temp[index] = str.substring(0, len - 1);
        }
        temp = Arrays.stream(temp).filter(str -> str != null).toArray(String[]::new);
        return String.join(" ", temp);
    }
}