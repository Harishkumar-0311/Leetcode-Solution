class Solution {
    public int rob(int[] nums) {
        int money1=0;
        int money2=0;
        int len=nums.length;
        for(int i=0;i<len;i+2){
           money1+=arr[i];
            }
        for(int i=1;i<len;i+2){
            money2+=arr[i];
        }
        return Math.max(money2,money1);
        }
    }
}