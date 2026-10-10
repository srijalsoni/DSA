class Solution {
    public int numWays(String s) {
        int n = s.length();
        int mod = 1000000007;
        int ones = 0;

        for(int i = 0; i<n ; i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }
        if(ones %3 != 0){
            return 0;
        }

        if(ones == 0){
            return (int)((long)(n-1)*(n-2) / 2 % mod);
        }

        int k = ones / 3;
        int count1 = 0 , count2 = 0;
        long ways1 = 0, ways2 = 0;
        for(int i = 0; i<n ; i++){
            if(s.charAt(i) == '1'){
                count1++;
                count2++;
            }
            if(count1 == k){
                ways1++;
            }
            if(count2 == 2*k){
                ways2++;
            }
        }    
        return (int)(ways1 * ways2 % mod);
    }
}