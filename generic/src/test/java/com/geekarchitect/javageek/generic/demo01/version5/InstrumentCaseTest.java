package com.geekarchitect.javageek.generic.demo01.version5;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.Instrument.WoodwindInstrument;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InstrumentCaseTest {

    @Test
    void getInstrument01() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        InstrumentCase<Flute> instrumentCase = new InstrumentCase<>(flute);
        // 从乐器盒中取出乐器长笛，不需要强制类型转换，因为使用了泛型，编译器已经知道乐器盒中存放的是长笛。
        Flute theFlute = instrumentCase.getInstrument();
        System.out.println(theFlute);
    }

    @Test
    void getInstrument02() {
        Brick brick = new Brick(2, 4, 6);
        // 从乐器盒无法放入板砖，因为板砖不属于乐器的子类
        //InstrumentCase<Brick> instrumentCase = new InstrumentCase<>(brick);
    }

    @Test
    void getInstrument03() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        InstrumentCase instrumentCase = new InstrumentCase(flute);
        //无法从乐器盒中取出Flute对象,只能取出Instrument对象
        //Flute theFlute = instrumentCase.getInstrument();
    }
    @Test
    void getInstrument04() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        //InstrumentCase<Flute>不是InstrumentCase<WoodwindInstrument>子类
        //InstrumentCase<WoodwindInstrument> instrumentCase = new InstrumentCase<Flute>(flute);
    }
    @Test
    void getInstrument05() {
        //ArrayList<Flute>不是ArrayList<WoodwindInstrument>子类
        //List<WoodwindInstrument> list = new ArrayList<Flute>();

        //ArrayList<Flute>是List<Flute>的子类
        List<Flute> list = new ArrayList<Flute>();

    }
    @Test
    void getInstrument07() {
       WoodwindInstrument[] woodwindInstruments = new Flute[10];
       woodwindInstruments[0] = new Flute("Flute", "Wood", "60cm", "Metal", "C");
       System.out.println(woodwindInstruments[0]);
    }
}