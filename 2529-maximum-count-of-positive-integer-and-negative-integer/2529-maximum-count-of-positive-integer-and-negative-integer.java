class Solution {
    public int maximumCount(int[] nums) {
        int negative=0;
        int positive=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative++;
            }else if(nums[i]>0){
                positive++;
            }
        }
    int max=0;
    max=Math.max(positive,negative);
    return max;
    }
}