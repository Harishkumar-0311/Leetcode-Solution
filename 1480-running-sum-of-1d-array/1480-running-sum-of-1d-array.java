class Solution {
    public int[] runningSum(int[] arr) {
        int count = 0;
        int[] ans = new int[arr.length ];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                ans[0] = arr[0];
                count++;
            }
            if (i > 0) {
                ans[i] = arr[i] + ans[i - 1];
                count++;
            }

        }
        return ans;
    }
}