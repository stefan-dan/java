package com.company.array_inplace_swap;

import java.util.Arrays;

public class ArraySwap {

    // save starting position of both words and array's size
    // until it's a space move letters to the end
    // reverse reading the array
    // if it is the second space move letters to the start of the array until it's another space
    // remove the space

    public static void main(String[] args) {
        ArraySwap util = new ArraySwap();
        String wrongMessage = "perfect makes practice";

        var correctMessage = new StringBuilder(String.join("", wrongMessage)).reverse().toString().split("");
        System.out.println(Arrays.toString(correctMessage));
        char[] array = wrongMessage.toCharArray();
        System.out.println(Arrays.toString(array));

        // reverse the whole array
        util.reverse(array, 0, array.length - 1);

        int firstSpacePos = util.findFirstSpacePos(array);
        int lastSpacePos = util.findLastSpacePos(array);

        // revers first word
        util.reverse(array, 0, firstSpacePos - 1);

        // reverse middle word
        util.reverse(array, firstSpacePos, lastSpacePos);

        // reverse last word
        util.reverse(array, lastSpacePos + 1, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private int findFirstSpacePos(char[] input) {
        int size = input.length - 1;
        for (int i = 0; i < size; i++) {
            if (input[i] == ' ') return i;
        }
        return 0;
    }

    private int findLastSpacePos(char[] input) {
        int size = input.length - 1;
        for (int i = size; i >= 0; i--) {
            if (input[i] == ' ') return i;
        }
        return 0;
    }

    private void reverse(char[] input, int startPos, int stopPos) {
        for (int i = startPos; i < stopPos; i++, stopPos--) {
            if (input[i] != input[stopPos]) {
                char temp = input[i];
                input[i] = input[stopPos];
                input[stopPos] = temp;
            }
        }
    }
}
