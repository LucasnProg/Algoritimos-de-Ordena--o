/*
 * Autor: Lucas Silva (GitHub: LucasnProg)
 * Descrição: Bubble sort
 * Data de criação: 07/09/2024
 */

 public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean trades;
        int lastUnsorted = array.length - 1;
    
        do {
            trades = false;
            int newLastUnsorted = 0;
            for (int index = 0; index < lastUnsorted; index++) {
                if (array[index] > array[index + 1]) {
                    int aux = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = aux;
                    trades = true;
                    newLastUnsorted = index;
                }
            }
            lastUnsorted = newLastUnsorted;
        } while (trades);
    }
    
}