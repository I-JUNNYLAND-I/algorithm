class Solution {
    public List<String> buildArray(int[] target, int n) {
        int len = target.length;
        int max = target[len - 1];
        Stack<String> answer = new Stack<>();
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (count > max) break;
            if (target[i] == count) {
                System.out.println(count);
                answer.push("Push");
                count++;
            } 
            else {
                while (count < target[i]) {
                    System.out.println(count);
                    answer.push("Push");
                    answer.push("Pop");    
                    count++;
                }
                i--;
            }
        }    
        return new ArrayList<String>(answer);
    }
}