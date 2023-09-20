package algorithms;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao implements Ordenacao_IF {
    public boolean checaVetorOrdenado(int[] numeros) {
        int size = numeros.length - 1;
        for (int i = 0; i < size - 1; i++) {
            if (numeros[i] > numeros[i + 1]) return false;
        }

        return true;
    }

    public long bubbleSort(int[] numeros) {
        long start = System.nanoTime();

        int size = numeros.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        long end = System.nanoTime();

        if (!checaVetorOrdenado(numeros)) return -1;

        return end - start;
    }

    public long selectionSort(int[] numeros) {
        long start = System.nanoTime();

        int size = numeros.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = temp;
        }

        long end = System.nanoTime();

        if (!checaVetorOrdenado(numeros)) return -1;

        return end - start;
    }

    public long insertionSort(int[] numeros) {
        long start = System.nanoTime();

        int size = numeros.length;
        for (int i = 1; i < size; i++) {
            int key = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > key) {
                numeros[j + 1] = numeros[j];
                j--;
            }

            numeros[j + 1] = key;
        }
        long end = System.nanoTime();

        if (!checaVetorOrdenado(numeros)) return -1;

        return end - start;
    }

    public long mergeSort(int[] numeros) {
        long start = System.nanoTime();

        int size = numeros.length;
        if (size > 1) {
            int mid = size / 2;

            int[] left = new int[mid];
            int[] right = new int[size - mid];
            System.arraycopy(numeros, 0, left, 0, mid);
            System.arraycopy(numeros, mid, right, 0, size - mid);

            mergeSort(left);
            mergeSort(right);

            merge(numeros, left, right);
        }

        long end = System.nanoTime();

        if (!checaVetorOrdenado(numeros)) return -1;

        return end - start;
    }

    private void merge(int[] numeros, int[] left, int[] right) {
        int sizeLeft = left.length;
        int sizeRight = right.length;
        int i = 0, j = 0, k = 0;

        while (i < sizeLeft && j < sizeRight) {
            if (left[i] <= right[j]) {
                numeros[k] = left[i];
                i++;
            } else {
                numeros[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < sizeLeft) {
            numeros[k] = left[i];
            i++;
            k++;
        }

        while (j < sizeRight) {
            numeros[k] = right[j];
            j++;
            k++;
        }
    }

    public long quickSort(int[] numeros) {
        long start = System.nanoTime();
        quickSort(numeros, 0, numeros.length - 1);
        long end = System.nanoTime();

        if (!checaVetorOrdenado(numeros)) return -1;

        return end - start;
    }

    private void quickSort(int[] numeros, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(numeros, left, right);

            quickSort(numeros, left, pivotIndex - 1);
            quickSort(numeros, pivotIndex + 1, right);
        }
    }

    private int partition(int[] numeros, int left, int right) {
        int pivot = numeros[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            if (numeros[i] <= pivot) {
                i++;
            } else if (numeros[j] > pivot) {
                j--;
            } else {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            }
        }

        int temp = numeros[left];
        numeros[left] = numeros[j];
        numeros[j] = temp;

        return j;
    }

    public long random_quickSort(int[] numeros) {
        long start = System.nanoTime();
        random_quickSort(numeros, 0, numeros.length - 1);
        long end = System.nanoTime();

        if (!checaVetorOrdenado(numeros)) return -1;

        return end - start;
    }

    private void random_quickSort(int[] numeros, int left, int right) {
        if (left < right) {
            int pivotIndex = randomPartition(numeros, left, right);

            random_quickSort(numeros, left, pivotIndex - 1);
            random_quickSort(numeros, pivotIndex + 1, right);
        }
    }

    private int randomPartition(int[] numeros, int left, int right) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(right - left + 1) + left;

        int temp = numeros[left];
        numeros[left] = numeros[randomIndex];
        numeros[randomIndex] = temp;

        return (partition(numeros, left, right));
    }

    public long quickSort_Java(int[] numeros) {
        long start = System.nanoTime();
        Arrays.sort(numeros);
        long end = System.nanoTime();

        if (!checaVetorOrdenado(numeros)) return -1;

        return end - start;
    }

    public long countingSort(int[] numeros) {
        long start = System.nanoTime();
        int max = numeros[0];
        int min = numeros[0];
        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        int range = max - min + 1;

        int[] countArray = new int[range];
        int[] outputArray = new int[numeros.length];

        for (int num : numeros) {
            countArray[num - min]++;
        }

        for (int i = 1; i < range; i++) {
            countArray[i] += countArray[i - 1];
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            outputArray[countArray[numeros[i] - min] - 1] = numeros[i];
            countArray[numeros[i] - min]--;
        }

        long end = System.nanoTime();

        if (!checaVetorOrdenado(outputArray)) return -1;

        return end - start;
    }
}
