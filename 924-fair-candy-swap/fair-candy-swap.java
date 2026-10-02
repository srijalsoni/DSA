class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
         int sumA = 0;
         int sumB = 0;
         for(int x : aliceSizes){
             sumA += x;
         }
         for(int y : bobSizes){
            sumB += y;
         } 
         int diff = (sumA - sumB)/2;

         HashSet<Integer> bobSet = new HashSet<>();
         for(int y : bobSizes){
            bobSet.add(y);
         }

         for(int x : aliceSizes){
            int y = x - diff;
            if(bobSet.contains(y)){
                return new int[]{x,y};
            }
         }
         return new int[0];


    }
}