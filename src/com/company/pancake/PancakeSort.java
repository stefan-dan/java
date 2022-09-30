package com.company.pancake;

import java.util.Arrays;

public class PancakeSort {

    public static void main(String[] args) {
        PancakeSort pancakeSort = new PancakeSort();

        int[] array = new int[]{1, 5, 4, 3, 2};

        System.out.println("Unsorted: " + Arrays.toString(array));

        int[] sorted = pancakeSort.sort(array);

        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

    private int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int length = arr.length;
        while (length > 0) {
            int maxIndex = 0;
            for (int i = 0; i < length; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            flip(arr, maxIndex + 1);
            flip(arr, length);
            length--;
        }
        return arr;
    }

    private void flip(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0) {
            return;
        }
        for (int i = 0; i < k / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[k - i - 1];
            arr[k - i - 1] = temp;
        }
    }
}