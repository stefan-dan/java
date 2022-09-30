package com.company.duplicates;

import java.util.*;

public class DuplicatesFinder {

    public List<String> findDuplicates(List<String> strings) {
        Set<String> uniques = new HashSet<>();
        List<String> response = new ArrayList<>();
        for (String string : strings) {
            if (string != null) {
                boolean isUnique = uniques.add(string);
                if (!isUnique) {
                    response.add(string);
                }
            }

        }
        return response;
    }

    public static void main(String[] args) {
        List<String> stringsWithDuplicates = Arrays.asList(null, "AAA", null, "BBB", "CCC", "AAA", "CCC");

        DuplicatesFinder finder = new DuplicatesFinder();

        finder.findDuplicates(stringsWithDuplicates)
                .forEach(System.out::println);
    }
}
