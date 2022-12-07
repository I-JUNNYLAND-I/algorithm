import java.util.ArrayList;

class Solution {

    public int calPoints(String[] operations) {

        ArrayList<Integer> integers = new ArrayList<>();

        for (String operation : operations) {
            switch (operation) {
                case "C":
                    integers.remove(integers.size() - 1);
                    break;
                case "D":
                    integers.add(integers.get(integers.size() - 1) * 2);
                    break;
                case "+":
                    integers.add(integers.get(integers.size() - 1) + integers.get(integers.size() - 2));
                    break;
                default:
                    integers.add(Integer.parseInt(operation));
                    break;
            }
        }
        return integers.stream()
            .mapToInt(Integer::intValue)
            .sum();
    }
}