package com.geekarchitect.javageek.generic.demo02;

/**
 * 三件乐器的乐器盒，用于存储三种类型的乐器。
 * @param <T> 第一种要存储的乐器类型，必须是 Instrument 的子类型
 * @param <U> 第二种要存储的乐器类型，必须是 Instrument 的子类型
 * @param <V> 第三种要存储的乐器类型，必须是 Instrument 的子类型
 */
public class FourInstrumentCase<T, U,V,W > extends ThreeInstrumentCaseV2<T,U,V> {
    private W instrument4;

    /**
     * 构造方法，用于创建一个包含三种指定乐器的 ThreeInstrumentCase 对象。
     * @param instrument1 第一种要存储的乐器
     * @param instrument2 第二种要存储的乐器
     * @param instrument3 第三种要存储的乐器
     */
    public FourInstrumentCase(T instrument1, U instrument2, V instrument3, W instrument4) {
        super(instrument1, instrument2, instrument3);
        this.instrument4 = instrument4;
    }

    public FourInstrumentCase() {
    }

    public W getInstrument4() {
        return instrument4;
    }

    public void setInstrument4(W instrument4) {
        this.instrument4 = instrument4;
    }
}

