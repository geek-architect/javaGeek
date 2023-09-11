package com.geekarchitect.javageek.generic.demo01.version2;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentCaseTest {

    @Test
    public void testGetInstrument01() {
        Flute flute = new Flute("Flute", "wood", "40cm", "reed", "C");
        InstrumentCase instrumentCase = new InstrumentCase(flute);
        // 从乐器盒中取出长笛,不需要进行强制类型转换
        Flute theFlute = instrumentCase.getFlute();
        System.out.println(theFlute);
    }

    @Test
    public void testGetInstrument02() {
        Brick brick = new Brick(2, 4, 6);
        InstrumentCase instrumentCase = new InstrumentCase();
        // 乐器盒中不能放入板砖,
        //instrumentCase.setFlute(brick);
    }
}