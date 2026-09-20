class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int diff = Math.abs(arr[1] -  arr[0]);
        for(int i = 2; i< n; i++){
            if(Math.abs(arr[i] -  arr[i-1]) != diff){
               return false;
            }
        }
        return true;
    }
}