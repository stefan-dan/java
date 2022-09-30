package com.company.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = new int[] {7, 1, 0, 6, 7, 43, -2, 10};

        System.out.println("Unsorted: " + Arrays.toString(array));

        quickSort.sort(array, 0, array.length - 1);

        System.out.println("Sorted: " + Arrays.toString(array));
    }

    public void sort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            sort(arr, begin, partitionIndex - 1);
            sort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
