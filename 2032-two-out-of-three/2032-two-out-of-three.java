class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        fillSetByArray(set1, nums1);
        fillSetByArray(set2, nums2);
        fillSetByArray(set3, nums3);
        List<Integer> list = new ArrayList();
        for (Integer i = 1; i <= 100; i++) {
            boolean b1 = set1.contains(i);
            boolean b2 = set2.contains(i);
            boolean b3 = set3.contains(i);
            if ((b1 && b2) || (b2 && b3) || (b1 && b3)) {
                list.add(i);
            }
        }
        return list;
    }
    
    public void fillSetByArray(Set<Integer> set, int[] nums) {
        for (int num : nums) {
            set.add(num);
        }
    }
}