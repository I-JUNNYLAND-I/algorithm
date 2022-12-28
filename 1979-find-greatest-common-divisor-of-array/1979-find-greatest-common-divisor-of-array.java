class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length-1];

        return gdc(min, max);
    }

    int gdc(int a, int b) { //최대 공약수

        if(a<b) // 유클리드 호제법 조건
        {
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0) { // 유클리드 호제법
            int r=a%b;
            a=b;
            b=r;
        }

        return a;
    }
    
}