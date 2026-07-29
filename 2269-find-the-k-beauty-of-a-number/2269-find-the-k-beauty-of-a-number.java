class Solution {
    public int divisorSubstrings(int num, int k) {
        int left = 0;
        int result = 0;
        String s = String.valueOf(num);
        for(int right = 0; right<s.length(); right++){ 
            if((right-left+1)==k){
                int n = Integer.parseInt(s.substring(left,right+1));
                if(n!=0 && num%n == 0){
                    result++;
                }
                left++;
            }
        }
        return result;
    }
}