class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findSubsets(nums,0,current,result);
        return result;
    }
    public void findSubsets(int[] nums,int index,List<Integer> current,List<List<Integer>> result) {
        if(index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Take
        current.add(nums[index]);
        findSubsets(nums,index+1,current,result);

        current.remove(current.size() - 1);
        // Don't Take
        findSubsets(nums,index+1,current,result);

    }
}