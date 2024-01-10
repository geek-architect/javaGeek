package com.geekarchitect.javageek.generic.onjava;

// generics/RandomList.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import java.util.*;
import java.util.stream.*;

public class RandomList<T> extends ArrayList<T> {
    private Random rand = new Random(47);

    public T select() {
        return get(rand.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        Arrays.stream(("I love Java and Python").split(" ")).forEach(rs::add);
        IntStream.range(0, 11).forEach(i -> System.out.print(rs.select() + " "));
    }
}
