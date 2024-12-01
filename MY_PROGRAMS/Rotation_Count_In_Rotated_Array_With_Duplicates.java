package MY_PROGRAMS;

public class Rotation_Count_In_Rotated_Array_With_Duplicates {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 5, 6, 6, 6, 7, 7, 0, 1, 2, 2 };
        int pivot = findPivotWithDuplicates(nums);
        System.out.println("\nThe number of Rotation is : " + (pivot + 1) + "\n");
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
}