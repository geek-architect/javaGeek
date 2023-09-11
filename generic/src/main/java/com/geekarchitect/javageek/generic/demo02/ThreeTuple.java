package com.geekarchitect.javageek.generic.demo02;

/**
 * A three-element tuple.
 * @param <A> the type of the first element
 * @param <B> the type of the second element
 * @param <C> the type of the third element
 */
public class ThreeTuple<A, B, C> extends Tuple<A, B> {
    private final C third;

    /**
     * Constructs a new ThreeTuple object.
     * @param first  the first element
     * @param second the second element
     * @param third  the third element
     */
    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    /**
     * Returns the third element.
     * @return the third element
     */
    public C getThird() {
        return third;
    }
}
