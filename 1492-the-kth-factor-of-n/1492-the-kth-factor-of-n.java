class Solution {
    public int kthFactor(int n, int k) {
       int[]ans=new int[k+1];
       int index=0;
       for(int i=1;i<n+1;i++){
        if(n%i==0){
            ans[index]=i;
            index++;
        }
        if(index>k){
            break;
        }
       
    }
      if(ans[k-1]==0){
        return -1;
      }else{
        return ans[k-1];
      }
    }
}