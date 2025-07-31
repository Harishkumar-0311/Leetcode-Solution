class Solution {
    public int maxProduct(int[] nums) {
       int max=0;
       int val=0;
       for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
           if(i!=j){
         val=(nums[i]-1)*(nums[j]-1);
           }
            if(val>max){
                max=val;
            }
        }
       } 
       return max;
    }
}