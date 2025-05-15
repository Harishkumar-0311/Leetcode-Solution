class Solution {
    public int strStr(String haystack, String needle) {
        int ans=-1;
        int index=haystack.indexOf(needle);
        if(index!=-1){
            ans=index;
        }
        return ans;
    }
}