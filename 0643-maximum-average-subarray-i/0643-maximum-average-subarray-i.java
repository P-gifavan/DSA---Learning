class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double result = Integer.MIN_VALUE;
        double sum = 0;
        for(int right=0; right<nums.length; right++) {
            sum = sum + nums[right];
            if((right-left+1)>k){
                sum = sum - nums[left];
                left++;
            }
            if((right-left+1)==k){
                result = Math.max(result,(sum/k));
            }
        }
        return result;
    }
}