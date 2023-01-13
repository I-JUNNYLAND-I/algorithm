class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i : arr){
            if(hashSet.contains(i*2) || (hashSet.contains(i/2) && i%2==0)){
                return true;
            }
            hashSet.add(i);
        }

        return false;
    }
}