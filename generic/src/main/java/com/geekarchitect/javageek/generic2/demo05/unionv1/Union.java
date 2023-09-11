package com.geekarchitect.javageek.generic2.demo05.unionv1;

import java.util.HashSet;
import java.util.Set;

public class Union {
    // Generic method
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Simple program to exercise generic method
    public static void main(String[] args) {
        Set guys = Set.of("Tom", "Dick", "Harry");
        Set stooges = Set.of("Larry", "Moe", "Curly");
        Set aflCio = union(guys, stooges);
        System.out.println(aflCio);
    }
}
