class Solution {
    public int subtractProductAndSum(int n) {
      int sum = 0, product = 1, result, last;
        while (n > 0) {
            last = n % 10;
            product = product * last;
            sum = sum + last;
            n=n/10;
        }
        result = product - sum;
return result;
 }
}