package com.geekarchitect.javageek.generic.demo04;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.Instrument.Instrument;
import com.geekarchitect.javageek.generic.Instrument.WindInstrument;
import com.geekarchitect.javageek.generic.Instrument.WoodwindInstrument;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/9/12
 */
public class Musician {
    /**
     * 打开乐器盒，演奏乐器
     * 入参InstrumentCase没有做泛型限制，可以演奏任何乐器
     * @param instrumentCase 乐器盒
     */
    public void openCase01(InstrumentCase instrumentCase){
        Instrument instrument=instrumentCase.getInstrument();
        System.out.println("打开乐器盒，拿出"+instrument.getName()+"开始演奏");
    }

    /**
     *  打开乐器盒，演奏乐器
     *  入参InstrumentCase做了泛型限制，只能演奏长笛
      * @param instrumentCase
     */
    public void openCase02(InstrumentCase<Flute> instrumentCase){
        Instrument instrument=instrumentCase.getInstrument();
        System.out.println("打开乐器盒，拿出"+instrument.getName()+"开始演奏");
    }

    /**
     * 打开乐器盒，演奏乐器
     * 入参InstrumentCase做了泛型限制，只能演奏吹管乐器
     * @param instrumentCase
     */
    public void openCase03(InstrumentCase<WindInstrument> instrumentCase){
        Instrument instrument=instrumentCase.getInstrument();
        System.out.println("打开乐器盒，拿出"+instrument.getName()+"开始演奏");
    }

    /**
     * 打开乐器盒，演奏乐器
     * 入参使用了泛型通配符，强调泛型必须为WindInstrument的子类，使入参的泛型支持协变
     * @param instrumentCase
     */
    public void openCase04(InstrumentCase<? extends WindInstrument> instrumentCase){
        Instrument instrument=instrumentCase.getInstrument();
        System.out.println("打开乐器盒，拿出"+instrument.getName()+"开始演奏");
    }

    /**
     * 打开乐器盒，演奏乐器
     * 入参使用泛型通配符，强调泛型必须为Flute的父类，使入参的泛型支持协变
     * @param instrumentCase
     */
    public void openCase05(InstrumentCase<? super WoodwindInstrument> instrumentCase){
        Instrument instrument=instrumentCase.getInstrument();
        System.out.println("打开乐器盒，拿出"+instrument.getName()+"开始演奏");
    }
}
