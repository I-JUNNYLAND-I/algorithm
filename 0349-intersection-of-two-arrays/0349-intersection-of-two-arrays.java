class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] longer = new int[]{};
        int[] shorter = new int[]{};
        if (nums1.length > nums2.length) {
            longer = nums1;
            shorter = nums2;
        } else {
            longer = nums2;
            shorter = nums1;
        }
        Set<Integer> set = new HashSet();
        for (int i = 0; i < shorter.length; i++) {
            int temp = shorter[i];
            for (int j = 0; j < longer.length; j++) {
                if (temp == longer[j]) {
                    set.add(temp);
                    longer[j] = -1;
                    break;
                }
            }
        }
        int size = set.size();
        int[] answer = new int[size];
        int index = 0;
        for (Integer num : set) {
            answer[index] = num;
            index++;
        }
        return answer;
    }
}