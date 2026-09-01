class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> list = new HashMap<>();
          List<Integer> result = new ArrayList<>();
        for(int num : nums1){
            list.put(num,list.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            if(list.containsKey(num ) && list.get(num) >0){
                result.add(num);
                list.put(num, list.get(num)-1);
            }
        }
        int[] arr = new int[result.size()];
       
        for(int i = 0; i< arr.length; i++){
            arr[i] = result.get(i);
        }
        return arr;
        
    }
}