class Solution {
    public int kthFactor(int n, int k) {
       if(k == 1)
            return 1;

        int num = 1;
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                num++;
                if(num == k)
                    return i;
            }
        }

        return -1;
    }
}