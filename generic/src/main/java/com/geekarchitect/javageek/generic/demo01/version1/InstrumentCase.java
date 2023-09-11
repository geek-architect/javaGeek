package com.geekarchitect.javageek.generic.demo01.version1;

/**
 * InstrumentCase类用于存放各种乐器。
 */
public class InstrumentCase {
    private Object instrument;

    /**
     * 构造方法，用于创建一个包含指定乐器的乐器盒对象。
     *
     * @param instrument 要存放的乐器
     */
    public InstrumentCase(Object instrument) {
        this.instrument = instrument;
    }

    /**
     * 返回乐器盒中存放的乐器。
     *
     * @return 存放的乐器
     */
    public Object getInstrument() {
        return instrument;
    }

    /**
     * 设置乐器盒中存放的乐器。
     *
     * @param instrument 要存放的乐器
     */
    public void setInstrument(Object instrument) {
        this.instrument = instrument;
    }


}

