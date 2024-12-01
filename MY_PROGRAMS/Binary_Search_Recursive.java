package MY_PROGRAMS;

public class Binary_Search_Recursive {
    public static void main(String[] args) {
        int[] nums = { -8, -7, 0, 8, 19, 32, 55, 74, 78, 80, 84, 100 };
        int target = 55;
        int index = binarySearchRecursive(nums, target, 0, nums.length - 1);
        if (index == -1) {
            System.out.println("\nTarget not found\n");
        } else {
            System.out.println("\nThe target was found at index : " + index + "\n");
        }
    }

    static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearchRecursive(arr, target, low, mid - 1);
            } else {
                return binarySearchRecursive(arr, target, mid + 1, high);
            }
        }
        return -1;
    }
}