/*
 * Autor: Lucas Silva (GitHub: LucasnProg)
 * Descrição: Insertion sort
 * Data de criação: 07/09/2024
 */
public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int index = 1; index < list.length; index++) {
            int minor = list[index];
            int secondIndex = index - 1;

            while (secondIndex >= 0 && list[secondIndex] > minor) {
                list[secondIndex + 1] = list[secondIndex];
                secondIndex--;
            }
            
            list[secondIndex + 1] = minor;
        }
    }
}
