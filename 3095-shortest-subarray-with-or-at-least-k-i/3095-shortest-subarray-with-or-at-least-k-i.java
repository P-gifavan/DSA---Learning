class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            int or = 0;
            for(int j=i;j<nums.length;j++) {
                or = or | nums[j];
                if(or >= k){
                    minLength = Math.min(minLength,j-i+1);
                    break;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}