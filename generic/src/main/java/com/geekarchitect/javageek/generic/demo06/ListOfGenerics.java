package com.geekarchitect.javageek.generic.demo06;

import java.util.ArrayList;
import java.util.List;

/**
 * onjava案例
 * // generics/ListOfGenerics.java
 * 用arrayList模拟泛型数组
 * @param <T>
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();
    public void add(T item) { array.add(item); }
    public T get(int index) { return array.get(index); }
}
