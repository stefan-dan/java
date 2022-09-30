package com.company.hash_map_collision;

public record ComplexKey(int key, String name) {

    @Override
    public boolean equals(Object o) {
        System.out.println("Called .equals() method!");
        return true;
    }

    @Override
    public int hashCode() {
        System.out.println("Called .hasCode() method!");
        return key;
    }

    @Override
    public String toString() {
        return "ComplexKey{" +
                "id=" + key +
                ", name='" + name + '\'' +
                '}';
    }
}
