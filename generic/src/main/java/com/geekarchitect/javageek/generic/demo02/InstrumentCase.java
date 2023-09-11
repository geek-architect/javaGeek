package com.geekarchitect.javageek.generic.demo02;

import com.geekarchitect.javageek.generic.Instrument.Instrument;

/**
 * InstrumentCase 类，用于存储两种类型的乐器。
 * @param <T> 要存储的第一种乐器类型，必须是 Instrument 的子类型
 * @param <U> 要存储的第二种乐器类型，必须是 Instrument 的子类型
 */
public class InstrumentCase<T extends Instrument, U extends Instrument> {
    private T instrument1;
    private U instrument2;

    /**
     * 构造方法，用于创建一个包含两种指定乐器的 InstrumentCase 对象。
     * @param instrument1 第一种要存储的乐器
     * @param instrument2 第二种要存储的乐器
     */
    public InstrumentCase(T instrument1, U instrument2) {
        this.instrument1 = instrument1;
        this.instrument2 = instrument2;
    }

    /**
     * 返回存储的第一种乐器。
     * @return 存储的第一种乐器
     */
    public T getInstrument1() {
        return instrument1;
    }

    /**
     * 设置存储的第一种乐器。
     * @param instrument1 要存储的第一种乐器。
     */
    public void setInstrument1(T instrument1) {
        this.instrument1 = instrument1;
    }

    /**
     * 返回存储的第二种乐器。
     * @return 存储的第二种乐器
     */
    public U getInstrument2() {
        return instrument2;
    }

    /**
     * 设置存储的第二种乐器。
     * @param instrument2 要存储的第二种乐器。
     */
    public void setInstrument2(U instrument2) {
        this.instrument2 = instrument2;
    }
}

