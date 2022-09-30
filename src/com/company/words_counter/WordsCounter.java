package com.company.words_counter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class WordsCounter {

    public static void main(String[] args) {
        WordsCounter counter = new WordsCounter();

        LocalDateTime start = LocalDateTime.now();

        System.out.println(counter.countWordsMatches(null));
        System.out.println(counter.countWordsMatches("   "));
        System.out.println(counter.countWordsMatches("Hello    World!   Hello  another World."));
        System.out.println(counter.countWordsMatches("The quick brown fox jumped over the lazy dog."));
        System.out.println(counter.countWordsMatches("I ate a donut. Then I ate another donut."));

        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Took: " + ChronoUnit.MILLIS.between(start, finish) + " milliseconds");
    }

    public Map<String, Integer> countWordsMatches(String input) {
        Map<String, Integer> resultMap = new HashMap<>();
        if (input != null) {
            String[] words = input.split("\\s+");
            for (String word : words) {
                resultMap.computeIfAbsent(word, w -> wordMatches(w, words));
            }
        }
        return resultMap;
    }

    public int wordMatches(String word, String[] words) {
        int count = 0;
        for (String temp : words) {
            if (word.equals(temp)) {
                count++;
            }
        }
        return count;
    }
}
