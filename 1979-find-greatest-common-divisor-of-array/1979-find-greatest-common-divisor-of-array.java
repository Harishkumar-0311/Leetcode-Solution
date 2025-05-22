class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n1 = nums[0];
        int n2 = nums[nums.length - 1];
        int min = n1 < n2 ? n1 : n2;

        while (min >= 2) {
            if ((n1 % min == 0) && (n2 % min == 0)) {
                break;
            }
            min--;
        }
        return min;
    }
}
