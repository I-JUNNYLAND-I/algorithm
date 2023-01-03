class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

         List<Integer> num1List = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            num1List.add(nums1[i]);
        }

        List<Integer> num2List = new ArrayList<>();
        for(int i=0; i<nums2.length; i++) {
            num2List.add(nums2[i]);
        }

        if(num1List.size() >= num2List.size()) {
            result.addAll(num1List);
            result.retainAll(num2List);
        } else {
            result.addAll(num2List);
            result.retainAll(num1List);
        }

        Set<Integer> resultSet = new HashSet<>(result);

        Integer[] unboxedArr = resultSet.toArray(Integer[]::new);
        int[] resultArr = new int[unboxedArr.length];

        for(int i=0; i<unboxedArr.length; i++) {
            resultArr[i] = unboxedArr[i];
        }

        return resultArr;
    }
}