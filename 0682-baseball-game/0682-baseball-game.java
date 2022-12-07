class Solution {
    public int calPoints(String[] operations) {
        List<String> temp = new ArrayList<>();
        temp.add(operations[0]);
        int result = 0;

        for (int i = 1; i < operations.length; i++) {
            if(operations[i].equals("+")) {
                temp.add(String.valueOf(Integer.parseInt(temp.get(temp.size()-1)) + Integer.parseInt(temp.get(temp.size()-2)) ));
            } else if (operations[i].equals("D")) {
                temp.add(String.valueOf(Integer.parseInt(temp.get(temp.size()-1)) * 2));
            } else if (operations[i].equals("C")) {
                temp.remove(temp.size()-1);
            } else {
                temp.add(operations[i]);
            }
        }

        for (String a : temp) {
            result += Integer.parseInt(a);
        }
        return result;
    }
}