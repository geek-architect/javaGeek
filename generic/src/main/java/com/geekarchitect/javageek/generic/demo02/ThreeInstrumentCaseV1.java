package com.geekarchitect.javageek.generic.demo02;

import com.geekarchitect.javageek.generic.Instrument.Instrument;
import com.geekarchitect.javageek.generic.demo02.InstrumentCase;

/**
 * 三件乐器的乐器盒，用于存储三种类型的乐器。
 * @param <T> 第一种要存储的乐器类型，必须是 Instrument 的子类型
 * @param <U> 第二种要存储的乐器类型，必须是 Instrument 的子类型
 * @param <V> 第三种要存储的乐器类型，必须是 Instrument 的子类型
 */
public class ThreeInstrumentCaseV1<T, U , V >  {
    private T instrument1;
    private U instrument2;
    private V instrument3;

    /**
     * 构造方法，用于创建一个包含三种指定乐器的 ThreeInstrumentCase 对象。
     * @param instrument1 第一种要存储的乐器
     * @param instrument2 第二种要存储的乐器
     * @param instrument3 第三种要存储的乐器
     */
    public ThreeInstrumentCaseV1(T instrument1, U instrument2, V instrument3) {
        this.instrument3 = instrument3;
    }

    public ThreeInstrumentCaseV1() {
    }


    /**
     * 返回存储的第三种乐器。
     * @return 存储的第三种乐器
     */
    public V getInstrument3() {
        return instrument3;
    }

    /**
     * 设置存储的第三种乐器。
     * @param instrument3 要存储的第三种乐器。
     */
    public void setInstrument3(V instrument3) {
        this.instrument3 = instrument3;
    }

    public T getInstrument1() {
        return instrument1;
    }

    public void setInstrument1(T instrument1) {
        this.instrument1 = instrument1;
    }

    public U getInstrument2() {
        return instrument2;
    }

    public void setInstrument2(U instrument2) {
        this.instrument2 = instrument2;
    }
}

