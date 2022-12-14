class Solution {
    public int[] getConcatenation(int[] nums) {
        return addAll(nums, nums);
    }
    
    int[] addAll(int[] array1, int[] array2) {
        if (array1 == null) {
            return clone(array2);
        } else if (array2 == null) {
            return clone(array1);
        } else {
            int[] joinedArray = new int[array1.length + array2.length];
            System.arraycopy(array1, 0, joinedArray, 0, array1.length);
            System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
            return joinedArray;
        }
    }

    int[] clone(int[] array) {
        return array == null ? null : (int[])array.clone();
    }
}