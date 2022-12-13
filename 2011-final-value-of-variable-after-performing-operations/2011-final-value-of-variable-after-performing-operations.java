class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for(int i=0; i<operations.length; i++) {
            if(operations[i].startsWith("--") || operations[i].endsWith("--")) {
                result--;
            }

            if (operations[i].startsWith("++") || operations[i].endsWith("++")) {
                result++;
            }
        }
        
        return result;
    }
}