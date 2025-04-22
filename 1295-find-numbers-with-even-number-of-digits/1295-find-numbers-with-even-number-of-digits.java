class Solution {
    public int findNumbers(int[] nums) {
         int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

     boolean even(int num) {
        int noofdigit = digit(num);
        return noofdigit % 2 == 0;
    }

     int digit(int n) {

        if (n < 0) {
            n = n * -1;
        }
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;

        }
        return count;
    }
    }
