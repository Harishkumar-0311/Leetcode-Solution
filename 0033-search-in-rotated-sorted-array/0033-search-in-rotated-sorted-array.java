class Solution {
          int search(int[]arr,int target){
        int pivot=findpivot(arr);
        if(pivot==-1){
            return binary(arr,target,0,arr.length-1);
        }
        if (arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binary(arr,target,0,pivot-1);
        }return binary(arr,target,pivot+1,arr.length-1);
    }

     int binary(int[] arr, int target,int start,int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }
        return -1;
    }

     int findpivot(int[]arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid<end&&arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid>start&&arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
