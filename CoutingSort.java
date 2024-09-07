/*
 * Autor: Lucas Silva (GitHub: LucasnProg)
 * Descrição: Couting Sort
 * Data de criação: 07/09/2024
 */
public class CoutingSort {
    public static void countSort(int[] array) {
        int len = array.length;
        int iterator;
        int maxValue = array[0];
        for (iterator = 1; iterator < len; iterator++) {
            if (array[iterator] > maxValue) {
                maxValue = array[iterator];
            }
        }
    
        int[] countArray = new int[maxValue + 1];
        for (iterator = 0; iterator < len; iterator++) 
            countArray[array[iterator]]++;

        for (iterator = 1; iterator <= maxValue; iterator++) 
            countArray[iterator] += countArray[iterator - 1];
        
    
        int[] outputArray = new int[len];
        for (iterator = len - 1; iterator >= 0; iterator--) {
            outputArray[countArray[array[iterator]] - 1] = array[iterator];
            countArray[array[iterator]]--;
        }
    
        for (iterator = 0; iterator < len; iterator++) 
            array[iterator] = outputArray[iterator];
        
    }
}
