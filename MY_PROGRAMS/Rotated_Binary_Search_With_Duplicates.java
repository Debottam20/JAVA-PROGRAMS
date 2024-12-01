package MY_PROGRAMS;

public class Rotated_Binary_Search_With_Duplicates {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 5, 6, 6, 6, 7, 7, 0, 1, 2, 2 };
        int target = 0;
        int ans = search(nums, target);
        System.out.println("\nThe target found at index : " + ans + "\n");
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, 0, (nums.length - 1));
        }
        if (nums[pivot] == target) {
            return pivot;
        } else if (nums[0] <= target) {
            return binarySearch(nums, target, 0, (pivot - 1));
        } else {
            return binarySearch(nums, target, (pivot + 1), (nums.length - 1));
        }
        // return pivot;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > low && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[mid] == arr[low] && arr[mid] == arr[high]) {
                if (low < arr.length - 1 && arr[low] > arr[low + 1]) {
                    return low;
                } else {
                    low++;
                }
                if (high > 0 && arr[high - 1] > arr[high]) {
                    return high - 1;
                } else {
                    high--;
                }
            } else if (arr[low] < arr[mid] || arr[low] == arr[mid] && arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}