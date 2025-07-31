class Solution {
    public int maxProduct(int[] nums) {
        //    int max=0;
        //    int val=0;
        //    for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //        if(i!=j){
        //      val=(nums[i]-1)*(nums[j]-1);
        //        }
        //         if(val>max){
        //             max=val;
        //         }
        //     }
        //    } 
        //    return max;
        int smax = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                smax = max;
                max = nums[i];

            } else if (smax < nums[i]) {
                smax = nums[i];

            }
        }
        int val = (max - 1) * (smax - 1);
        return val;
    }
}