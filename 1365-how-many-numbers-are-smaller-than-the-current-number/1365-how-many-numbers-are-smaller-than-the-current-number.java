class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
         int[]ansarr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
                ansarr[i]=count;
            }
        }
        return ansarr;
    }
}
