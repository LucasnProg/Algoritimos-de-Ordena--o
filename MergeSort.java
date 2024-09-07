/*
 * Autor: Lucas Silva (GitHub: LucasnProg)
 * Descrição: Merge sort
 * Data de criação: 07/09/2024
 */

public class MergeSort {
    public static void mergeSort(int[] array, int start, int end) {
        if (end - start > 1) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle, end);
            merge(array, start, middle, end);
        }
    }

    public static void merge(int[] array, int start, int middle, int end) {
        int[] tempArray = new int[end - start];
        int leftIndex = start;
        int rightIndex = middle;
        int tempIndex = 0;

        while (leftIndex < middle && rightIndex < end) {
            if (array[leftIndex] <= array[rightIndex]) {
                tempArray[tempIndex++] = array[leftIndex++];
            } else {
                tempArray[tempIndex++] = array[rightIndex++];
            }
        }

        while (leftIndex < middle) {
            tempArray[tempIndex++] = array[leftIndex++];
        }

        while (rightIndex < end) {
            tempArray[tempIndex++] = array[rightIndex++];
        }

        System.arraycopy(tempArray, 0, array, start, tempArray.length);
    }
}
