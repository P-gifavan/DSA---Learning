class Solution {
    public int subsetXORSum(int[] nums) {
        return findSubsets(nums,0,0);
    }
    public int findSubsets(int[] nums, int index, int xor) {
        if(index == nums.length) {
            return xor;
        }
        int take1 = findSubsets(nums,index+1,xor^nums[index]);
        int take2 = findSubsets(nums,index+1,xor);
        return take1+take2;
    }
}