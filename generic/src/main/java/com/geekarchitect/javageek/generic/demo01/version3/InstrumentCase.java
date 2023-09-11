package com.geekarchitect.javageek.generic.demo01.version3;

import com.geekarchitect.javageek.generic.Instrument.Instrument;

/**
 * InstrumentCase类用于存放乐器。
 */
public class InstrumentCase {
    private Instrument instrument;

    /**
     * 构造方法，用于创建一个包含指定乐器的乐器盒对象。
     *
     * @param instrument 要存放的乐器
     */
    public InstrumentCase(Instrument instrument) {
        this.instrument = instrument;
    }

    /**
     * 返回乐器盒中存放的乐器。
     *
     * @return 存放的乐器
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * 设置乐器盒中存放的乐器。
     *
     * @param instrument 要存放的乐器
     */
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}

