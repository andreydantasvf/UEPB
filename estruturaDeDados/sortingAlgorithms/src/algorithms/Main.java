package algorithms;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //int[] array = SortedAscendingArray(5000);
        //int[] array = SortedDescendingArray(5000);
        int[] array = UnsortedArray(10000);

        Ordenacao sort = new Ordenacao();
        System.out.println("Time bubbleSort: " + sort.bubbleSort(array.clone()));
        System.out.println("Time selectionSort: " + sort.selectionSort(array.clone()));
        System.out.println("Time insertionSort: " + sort.insertionSort(array.clone()));
        System.out.println("Time mergeSort: " + sort.mergeSort(array.clone()));
        System.out.println("Time quickSort: " + sort.quickSort(array.clone()));
        System.out.println("Time randomQuickSort: " + sort.random_quickSort(array.clone()));
        System.out.println("Time quickSortJava: " + sort.quickSort_Java(array.clone()));
        System.out.println("Time countingSort: " + sort.countingSort(array.clone()));
    }

    public static int[] SortedAscendingArray(int size) {
        int[] ascendingArray = new int[size];

        for (int i = 0; i < size; i++) {
            ascendingArray[i] = i;
        }

        return ascendingArray;
    }

    public static int[] SortedDescendingArray(int size) {
        int[] descendingArray = new int[size];

        for (int i = 0; i < size; i++) {
            descendingArray[i] = size - i - 1;
        }

        return descendingArray;
    }

    public static int[] UnsortedArray(int size) {
        int[] unsortedArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = random.nextInt(size);
        }

        return unsortedArray;
    }
}
