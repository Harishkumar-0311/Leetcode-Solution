class Solution {
    public void moveZeroes(int[] nums) {
         int n= nums.length;
    int count=0;
        for (int i = 0; i <n ; i++) {
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }

        }while(n>count){
            nums[count++]=0;
    }
   
}
}