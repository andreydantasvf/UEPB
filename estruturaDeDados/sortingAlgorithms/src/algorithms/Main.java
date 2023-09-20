package algorithms;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 34, 22, 12, 22, 11, 90};

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
}
