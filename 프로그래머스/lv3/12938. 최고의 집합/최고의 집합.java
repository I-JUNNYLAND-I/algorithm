class Solution {
    public int[] solution(int n, int s) {
        // 각 원소의 합이 s가 되면서, 곱이 최고가 되야한다. ==> 최대한 차이가 안나는 숫자들로 구성해야함
        if (s / n < 1) return new int[]{-1};
        int[] answer = new int[n];
        int share = s / n;
        int rest = s % n; 
        for (int i = 0; i < n; i++) answer[i] = share;
        int index = n - 1;
        while(rest > 0) {
            answer[index]++;
            rest--;
            index--;
            if (index == -1) index = n - 1;
        }
        return answer;
    }
}