package com.geekarchitect.javageek.generic.demo07.version2;

import com.geekarchitect.javageek.generic.Instrument.Flute;

/**
 * 乐器盒类，用于存放各种乐器。
 *
 * @param <T> 存储的乐器类型
 */
public class InstrumentCase<T> {
    private T instrument;

    /**
     * 构造方法，用于创建一个包含指定乐器的乐器盒对象。
     *
     * @param instrument 要存放的乐器
     */
    public InstrumentCase(T instrument) {
        this.instrument = instrument;
    }

    public InstrumentCase() {
    }

    //main方法
    public static void main(String[] args) {
        InstrumentCase<Flute> fluteCase = new InstrumentCase<Flute>();
        Flute flute = new Flute("长笛", "D调", "上低音", "竹子", "金属");
        fluteCase.setInstrument(flute);
        Flute theFlute = fluteCase.getInstrument();
    }

    /**
     * 返回乐器盒中存放的乐器。
     *
     * @return 存放的乐器
     */
    public T getInstrument() {
        return instrument;
    }

    /**
     * 设置乐器盒中存放的乐器。
     *
     * @param instrument 要存放的乐器
     */
    public void setInstrument(T instrument) {
        this.instrument = instrument;
    }
}

