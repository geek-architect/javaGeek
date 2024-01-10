package com.geekarchitect.javageek.generic.demo01.version5;

import com.geekarchitect.javageek.generic.Instrument.Instrument;

/**
 * InstrumentCase 类，用于存储各种类型的乐器。
 * @param <T> 要存储的乐器类型，必须是 Instrument 的子类型
 */
public class InstrumentCase <T extends Instrument>{
    private T instrument;

    /**
     * 构造方法，用于创建一个包含指定乐器的 InstrumentCase 对象。
     * @param instrument 要存储的乐器
     */
    public InstrumentCase(T instrument) {
        this.instrument = instrument;
    }

    public InstrumentCase() {
    }

    /**
     * 返回存储在乐器盒中的乐器。
     * @return 存储的乐器
     */
    public T getInstrument() {
        return instrument;
    }

    /**
     * 设置存储在乐器盒中的乐器。
     * @param instrument 要存储的乐器
     */
    public void setInstrument(T instrument) {
        this.instrument = instrument;
    }
}

