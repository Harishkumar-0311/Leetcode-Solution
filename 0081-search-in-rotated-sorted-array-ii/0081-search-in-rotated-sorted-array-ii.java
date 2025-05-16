class Solution {
    public boolean search(int[] arr, int target) {
      int pivot = findPivotWithDuplicates(arr);

        if (pivot == -1) {
            return binary(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return true;
        }

        if (target >= arr[0]) {
            return binary(arr, target, 0, pivot - 1);
        }

        return binary(arr, target, pivot + 1, arr.length - 1);
    }

    static boolean binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true; 
            }
        }
        return false; 
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                if (start < end && arr[start] > arr[start + 1]) return start;
                start++;

                if (end > start && arr[end - 1] > arr[end]) return end - 1;
                end--;
            }
           
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; 
    }
}
