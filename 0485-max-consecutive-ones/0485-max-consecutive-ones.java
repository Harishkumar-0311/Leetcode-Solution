class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int high=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                high++;
if (high>max){
    max=high;
}
            }else{
                high=0;
            }
        }return max;
    }
}