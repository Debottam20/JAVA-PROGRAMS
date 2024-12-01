package MY_PROGRAMS;

public class Rotation_Count_In_Rotated_Array_Without_Duplicates {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int pivot = findPivot(nums);
        System.out.println("\nThe number of Rotation is : " + (pivot + 1) + "\n");
    }

    static int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > low && arr[mid - 1] > arr[mid]) {
                return mid;
            } else if (arr[mid] <= arr[low]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}