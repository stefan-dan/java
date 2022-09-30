package com.company.birthday_cake;

import java.util.List;

public class BirthdayCakeCollections {

    public static void main(String[] args) {
        List<Integer> candlesOne = List.of(1);
        List<Integer> candles = List.of(4, 4, -1, 3, 1, 4, 0);
        System.out.println(new BirthdayCakeCollections().birthdayCakeCandles(candlesOne));
        System.out.println(new BirthdayCakeCollections().birthdayCakeCandles(candles));
    }

    private int birthdayCakeCandles(List<Integer> candles) {
        Integer max = candles.stream().max(Integer::compareTo).orElseThrow(IllegalArgumentException::new);
        return (int) candles.stream().filter(max::equals).count();
    }
}
