class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[]arr=new int[matrix.length*matrix[0].length];
        int h=0;
        for(int[] val:matrix){
            for (int nums:val){
                arr[h]=nums;
                h++;

            }

        }
        Arrays.sort(arr);
        return arr[k-1];
    }
    }
