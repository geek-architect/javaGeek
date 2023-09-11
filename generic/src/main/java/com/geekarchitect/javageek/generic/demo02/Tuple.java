package com.geekarchitect.javageek.generic.demo02;

/**
 * Tuple类用于存储两个元素。
 *
 * @param <T> 第一个元素的类型
 * @param <U> 第二个元素的类型
 */
public class Tuple<T, U> {
    private final T first;
    private final U second;

    /**
     * 构造方法，用于创建一个新的Tuple对象。
     *
     * @param first  第一个元素
     * @param second 第二个元素
     */
    public Tuple(T first, U second) {
        this.first = first;
        this.second = second;
    }

    /**
     * 返回Tuple的第一个元素。
     *
     * @return 第一个元素
     */
    public T getFirst() {
        return first;
    }

    /**
     * 返回Tuple的第二个元素。
     *
     * @return 第二个元素
     */
    public U getSecond() {
        return second;
    }
}

