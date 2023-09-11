package com.geekarchitect.javageek.generic.demo01.version2;

import com.geekarchitect.javageek.generic.Instrument.Flute;

/**
 * InstrumentCase类用于存放长笛。
 */
public class InstrumentCase {
    private Flute flute;

    /**
     * 构造方法，用于创建一个包含指定长笛的乐器盒对象。
     *
     * @param flute 要存放的长笛
     */
    public InstrumentCase(Flute flute) {
        this.flute = flute;
    }

    /**
     * 构造方法，用于创建一个空的乐器盒对象。
     */
    public InstrumentCase() {

    }

    /**
     * 返回乐器盒中存放的长笛。
     *
     * @return 存放的长笛
     */
    public Flute getFlute() {
        return flute;
    }

    /**
     * 设置乐器盒中存放的长笛。
     *
     * @param flute 要存放的长笛
     */
    public void setFlute(Flute flute) {
        this.flute = flute;
    }
}


