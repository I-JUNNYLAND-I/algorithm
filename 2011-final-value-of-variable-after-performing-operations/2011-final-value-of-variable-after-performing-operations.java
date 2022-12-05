class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String o : operations) {
            if (o.contains("++")) {
                count++;
            } else {
                count--;
            }
        }
        return count;
    }
}