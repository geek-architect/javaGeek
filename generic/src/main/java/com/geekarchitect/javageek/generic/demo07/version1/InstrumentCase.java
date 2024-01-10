package com.geekarchitect.javageek.generic.demo07.version1;

import com.geekarchitect.javageek.generic.Instrument.Flute;

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

    //无参构造方法
    public InstrumentCase() {
    }

    //main方法，程序的入口
    public static void main(String[] args) {
        InstrumentCase instrumentCase = new InstrumentCase();
        Flute flute = new Flute("长笛", "上低音域", "竖吹", "木头", "C调");
        instrumentCase.setInstrument(flute);
        //手动添加强制类型转换
        Flute theFlute = (Flute) instrumentCase.getInstrument();
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

