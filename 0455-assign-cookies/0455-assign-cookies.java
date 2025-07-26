class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
       int count=0;
       int a=g.length;
       int b=s.length;
    //    int max=a>b?b:a;
       for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
             if(g[i]<=s[j]){
                s[j]=0;
             count++;
             break;
        }
       } 
      
    }
     return count;
}
}