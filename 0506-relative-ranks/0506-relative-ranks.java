import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] findRelativeRanks(int[] score) {

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

        int[] array = Arrays.copyOf(score, score.length);
        System.out.println("array = " + Arrays.toString(array));
        Arrays.sort(array);

        List<Integer> collect = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(collect);

        System.out.println("collect.toString() = " + collect.toString());

        for (int i = 0; i < collect.size(); i++) {
            integerIntegerHashMap.put(collect.get(i), i);
        }

        String[] strings = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            Integer integer = integerIntegerHashMap.get(score[i]);
            strings[i] = medal(integer);
        }
        System.out.println("strings = " + Arrays.toString(strings));
        return strings;
    }


    private String medal(Integer integer) {
        switch (integer) {
            case 0:
                return "Gold Medal";
            case 1:
                return "Silver Medal";
            case 2:
                return "Bronze Medal";
            default:
                int rank = integer + 1;
                return String.valueOf(rank);
        }
    }

}
