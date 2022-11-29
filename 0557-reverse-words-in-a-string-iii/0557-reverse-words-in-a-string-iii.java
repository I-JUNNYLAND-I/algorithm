import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        String result = "";
        
        String[] sSubArr = s.split(" "); //hi, my, name, is, heejeong, choi! -> arr

        List<String> sSubList = new ArrayList<>(); //여기서 뒤집을까?

        for (String value : sSubArr) {
            StringBuilder sb = new StringBuilder(value);
            sSubList.add(sb.reverse().toString());
        }


        result = String.join(" ", sSubList);
        
        return result;
    }
}