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
    int val=0;
       int max=0;
       for (int i=0; i<nums.length;i++)
       {
        if(max<=nums[i])
        {
            val=max;
            max=nums[i];

        }else if (val<nums[i])
        {
            val=nums[i];

        }
       }
        int ans=(max-1)*(val-1);
        return ans;
    }
}