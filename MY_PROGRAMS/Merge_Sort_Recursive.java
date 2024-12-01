package MY_PROGRAMS;

import java.util.Arrays;

public class Merge_Sort_Recursive {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 4, -2, 0, -7, -66, 0, 19, 78, 55, 1 };
        System.out.println("\nBefore sorting the array is : " + Arrays.toString(arr) + "\n");
        arr = mergeSort(arr);
        System.out.println("\nAfter sorting the array is : " + Arrays.toString(arr) + "\n");
    }

    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {

        int[] finalArr = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] > second[j]) {
                finalArr[k] = second[j];
                j++;
            } else {
                finalArr[k] = first[i];
                i++;
            }
            k++;
        }

        while (i < first.length) {
            finalArr[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            finalArr[k] = second[j];
            j++;
            k++;
        }

        return finalArr;

    }
}