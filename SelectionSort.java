/*
 * Autor: Lucas Silva (GitHub: LucasnProg)
 * Descrição: Selection sort
 * Data de criação: 07/09/2024
 */
public class SelectionSort {
    public static void selectionSort(int[] array){
        for (int index = 0; index < array.length-1; index++) {
            int minorIndex = index;
            for (int secondIndex = index + 1; secondIndex < array.length; secondIndex++) {
                if (array[minorIndex] > array[secondIndex]) {
                    minorIndex = secondIndex;
                }
            }
            int temp = array[minorIndex];
            array[minorIndex] = array[index];
            array[index] = temp;
        }
        
    }
}
