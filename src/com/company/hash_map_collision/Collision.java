package com.company.hash_map_collision;

import java.util.HashMap;
import java.util.Map;

public class Collision {
    public static void main(String[] args) {
        Map<ComplexKey, String> hashMap = new HashMap<>();

        ComplexKey k1 = new ComplexKey(1, "firstKey");
        ComplexKey k2 = new ComplexKey(2, "secondKey");
        ComplexKey k3 = new ComplexKey(2, "thirdKey");

        System.out.printf("storing value for %s%n", k1);
        hashMap.put(k1, "firstValue");
        System.out.printf("storing value for %s%n", k2);
        hashMap.put(k2, "secondValue");
        System.out.printf("storing value for %s%n", k3);
        hashMap.put(k3, "thirdValue");

        System.out.printf("Retrieving value for %s%n", k1);
        String v1 = hashMap.get(k1);
        System.out.printf("Retrieving value for %s%n", k2);
        String v2 = hashMap.get(k2);
        System.out.printf("Retrieving value for %s%n", k3);
        String v3 = hashMap.get(k3);
    }
}
