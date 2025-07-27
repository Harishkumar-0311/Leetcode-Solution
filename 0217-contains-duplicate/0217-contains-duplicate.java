class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
       int n=nums.length;
        boolean isDuplicate = false;
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                isDuplicate = true;
                break;
            } else {
                set.add(nums[i]);
            }
        }
        return isDuplicate;
    }
}