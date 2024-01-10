package com.geekarchitect.javageek.generic.demo02;

/**
 * A three-element tuple.
 * @param <T> the type of the first element
 * @param <U> the type of the second element
 * @param <V> the type of the third element
 */
public class ThreeTuple<T, U, V> extends Tuple<T, U> {
    private final V third;

    /**
     * Constructs a new ThreeTuple object.
     * @param first  the first element
     * @param second the second element
     * @param third  the third element
     */
    public ThreeTuple(T first, U second, V third) {
        super(first, second);
        this.third = third;
    }

    /**
     * Returns the third element.
     * @return the third element
     */
    public V getThird() {
        return third;
    }
}
