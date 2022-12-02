class Solution {
    public int addDigits(int num) {
    if (num < 10) {
            return num;
        } else {
            while (true) {
                int newNum = 0;
                String[] arrayNum = String.valueOf(num).split("");
                for (int i = 0; i < arrayNum.length; i++) {
                    newNum += Integer.parseInt(arrayNum[i]);
                }
                num = newNum;
                if (newNum < 10) {
                    return newNum;
                }
            }
        }
    }
}