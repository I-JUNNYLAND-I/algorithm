class Solution {
    public int calPoints(String[] operations) {
        int[] scores = new int[1000];
        int pointer = 0;
        for (String ops : operations) {
            switch (ops) {
                case "C" : {
                    pointer--;
                    scores[pointer] = 0;
                    break;
                }
                case "D" : {
                    scores[pointer] = scores[pointer - 1] * 2;
                    pointer++;
                    break;
                }
                case "+" : {
                    scores[pointer] = scores[pointer - 1] + scores[pointer - 2];
                    pointer++;
                    break;
                }
                default : {
                    scores[pointer] = Integer.parseInt(ops);
                    pointer++;
                    break;
                }
            }
        }
        return sum(scores);
    }
    
    private int sum(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}