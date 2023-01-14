class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
	    int result = 0, key;
	    for(int i=0;i<nums.length;i++) {
		key = nums[i] - Integer.parseInt(new StringBuffer(String.valueOf(nums[i])).reverse().toString());

            if(map.containsKey(key))
		    result = (result + map.get(key)) % 1000000007;
		map.put(key, map.getOrDefault(key, 0) + 1);
	}
        
	return result;
    }
}