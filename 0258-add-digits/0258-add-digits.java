import java.util.Stack;

class Solution {

    public int addDigits(int num) {

        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        
        while (num > 0) {
            stack.push(num % 10);
            num = num / 10;
        }


        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        if (answer >= 10) {
            return addDigits(answer);
        }

        return answer;
    }
}