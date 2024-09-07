/*
 * Autor: Lucas Silva (GitHub: LucasnProg)
 * Descrição: Quick sort
 * Data de criação: 07/09/2024
 */

public class QuickSort {
    public static int partition(int[] array, int first, int last) {
        int pivot = array[last]; 
        int iterator = first - 1; 
        int aux;

        for (int index = first; index < last; index++) {
            if (array[index] <= pivot) { 
                iterator++;  
                aux = array[iterator];
                array[iterator] = array[index];
                array[index] = aux;
            }
        }
        aux = array[iterator + 1];
        array[iterator + 1] = array[last];
        array[last] = aux;

        return iterator + 1; 
    }

    public static void quickSort(int[] array, int first, int last) {
        if (first < last) { 
            int pivotPosition = partition(array, first, last); 
            quickSort(array, first, pivotPosition - 1);  
            quickSort(array, pivotPosition + 1, last);  
        }
    }
}
