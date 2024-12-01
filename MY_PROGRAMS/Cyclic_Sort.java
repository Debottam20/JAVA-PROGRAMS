package MY_PROGRAMS;

import java.util.Arrays;
public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 1, 2, 8, 4, 7, 3 };
        // int[] arr = {4,3,2,7,8,2,3,1};
        // This algo does not work with duplicate elements
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.err.print("The sorted array is : \n" + Arrays.toString(arr));
    }
}