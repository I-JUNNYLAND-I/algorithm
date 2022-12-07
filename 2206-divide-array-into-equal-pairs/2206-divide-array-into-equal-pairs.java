class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> objects = new HashSet<>();

        for (int num : nums) {
            if(!objects.add(num)) {
                objects.remove(num);
            }
        }
        return objects.isEmpty();
    }
}