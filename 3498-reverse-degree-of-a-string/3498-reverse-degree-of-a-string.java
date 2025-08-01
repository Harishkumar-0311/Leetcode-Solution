class Solution {
    public int reverseDegree(String s) {
    char[]ch=s.toCharArray();
    int ans=0;
    for(int i=0;i<ch.length;i++){
        int val='z'-ch[i]+1;
        ans=ans+(val*(i+1));
    }
    return ans;    
    }
}