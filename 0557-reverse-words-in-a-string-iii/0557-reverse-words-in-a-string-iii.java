import java.util.Arrays;

class Solution {

    public String reverseWords(String s) {

        String[] split = s.split(" ");
        return Arrays.stream(split)
            .map(data -> new StringBuffer(data).reverse() + " ")
            .collect(Collectors.joining())
            .trim();
    }
}