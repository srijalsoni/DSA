class Solution {
    public int maximumWealth(int[][] accounts) {
         int max = 0;
         for(int[] cus : accounts){
            int sum = 0;
            for(int money : cus){
                sum += money;
            }
             max = Math.max(sum,max);
         }
         return max;
    }
}