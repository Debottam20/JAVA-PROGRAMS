package MY_PROGRAMS;

public class Binary_Search_Infinite_Array {
    public static void main(String[] args) {
        int[] nums = {1,5,8,11,66,88,100,111,654,1000,2212,2400,3002,3354,3454,5415,6115,7165,8516,9515,10000};
        int target = 2212;
        System.out.println("\nThe array index is : " + findRangeAndAns(nums, target) + "\n");
    }

    static int findRangeAndAns(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while (target > arr[high]) {
            int temp = high + 1;
            high = high + (high - low + 1);
            low = temp;
        }
        return binarySearch(arr, target, low, high);
    }

    static int binarySearch(int[] arr, int target, int low, int high) {
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}