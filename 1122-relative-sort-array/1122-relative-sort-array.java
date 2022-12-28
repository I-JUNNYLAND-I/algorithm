class Solution {
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int j=0;

        int[] freq=new int[100000];
        int[] result=new int[arr1.length];

        for(int i:arr1){
            freq[i]++;
        }

        for(int i:arr2){
            while(freq[i]!=0){
                result[j++]=i;
                freq[i]--;
            }
        }

        for(int i=0;i<freq.length;i++){
            while(freq[i]!=0){
                result[j++]=i;
                freq[i]--;
            }
        }

        return result;
    }

}