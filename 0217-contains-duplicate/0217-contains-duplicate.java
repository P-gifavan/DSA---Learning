class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> kanna = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(kanna.contains(nums[i])) {
                return true;
            }else {
                kanna.add(nums[i]);
            }
        }
        return false;
    }
}