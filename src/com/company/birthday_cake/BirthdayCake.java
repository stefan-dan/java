package com.company.birthday_cake;

public class BirthdayCake {

    public static void main(String[] args) {
        int[] candlesNull = null;
        int[] candlesEmpty = {};
        int[] candlesOne = {1};
        int[] candles = {4, 4, -1, 3, 1, 4, 0};
        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println(birthdayCake.birthdayCakeCandles(candlesNull));
        System.out.println(birthdayCake.birthdayCakeCandles(candlesEmpty));
        System.out.println(birthdayCake.birthdayCakeCandles(candlesOne));
        System.out.println(birthdayCake.birthdayCakeCandles(candles));
    }

    private int birthdayCakeCandles(int[] candles) {
        int tallestCandlesCount = 0;
        if (candles != null && candles.length > 0) {
            int tallestCandle = findMax(candles);
            tallestCandlesCount = countElementMatches(tallestCandle, candles);
        }
        return tallestCandlesCount;
    }

    private int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private int countElementMatches(int element, int[] array) {
        int count = 0;
        for (int i : array) {
            if (element == i) count++;
        }
        return count;
    }
}
