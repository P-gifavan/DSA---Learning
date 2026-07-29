class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        int left =0;
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int right=0;right<nums.length;right++) {
            if((right-left+1)==k){
                result =Math.min(result,nums[right]-nums[left]);
                left++;
            }
        }
        return result;
    }
}