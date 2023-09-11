package com.geekarchitect.javageek.generic.demo01.version3;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentCaseTest {
    @Test
    public void testGetInstrument01() {
        Brick brick= new Brick(2, 4, 6);
        // 从乐器盒无法放入板砖，因为板砖不属于乐器的子类
        //InstrumentCase instrumentCase = new InstrumentCase(brick);
    }
    @Test
    public void testGetInstrument02() {
        Flute flute = new Flute("Flute", "wood", "40cm", "reed", "C");
        InstrumentCase instrumentCase = new InstrumentCase(flute);
        // 从乐器盒中取出乐器长笛，需要强制类型转换，因为乐器盒中存放的是Instrument类型的对象。
        Flute theFlute = (Flute) instrumentCase.getInstrument();
        System.out.println(theFlute);
    }
}