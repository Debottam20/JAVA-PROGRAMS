package MY_PROGRAMS;

public class Rotated_Binary_Search_Using_Recursion {
    public static void main(String[] args) {
        int[] arr = { 19, 32, 55, 78, 84, 1, 4, 8, 12, 16, 18 };
        int target = 55;
        int ans = rotatedBS(arr, target, 0, (arr.length - 1));
        if (ans != -1) {
            System.out.println("\nThe target was found at position (Not array index) : " + (ans + 1) + "\n");
        } else {
            System.out.println("\nTarget not found in the array\n");
        }
    }

    static int rotatedBS(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[low] <= arr[mid]) {
            if (target >= arr[low] && target <= arr[mid]) {
                return rotatedBS(arr, target, low, mid - 1);
            } else {
                return rotatedBS(arr, target, mid + 1, high);
            }
        }
        if (target >= arr[mid] && target <= arr[high]) {
            return rotatedBS(arr, target, mid + 1, high);
        }
        return rotatedBS(arr, target, low, mid - 1);
    }
}