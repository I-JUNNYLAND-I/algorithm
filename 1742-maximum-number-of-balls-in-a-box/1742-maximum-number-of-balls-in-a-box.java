class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[46];
        for (int i = lowLimit; i <= highLimit; i++) {
            box[getBallNumber(i)]++;
        }
        return findMax(box);
    }
    
    public int getBallNumber(int ball) {
        int answer = 0;
        while(true) {
            answer = answer + ball % 10;
            ball = ball / 10;
            if (ball == 0) break;
        }
        return answer;
    }
    
    public int findMax(int[] box) {
        int max = 0;
        for (int num : box) {
            max = Math.max(max, num);
        }
        return max;
    }
}