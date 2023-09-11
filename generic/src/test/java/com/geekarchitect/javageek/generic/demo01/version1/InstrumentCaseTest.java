package com.geekarchitect.javageek.generic.demo01.version1;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentCaseTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testGetInstrument01() {
        Flute flute = new Flute("Flute", "wood", "40cm", "reed", "C");
        InstrumentCase instrumentCase = new InstrumentCase(flute);
        // 从乐器盒中取出乐器,需要进行强制类型转换
        Flute theFlute = (Flute) instrumentCase.getInstrument();
        System.out.println(theFlute);
    }
    @Test
    public void testGetBrick() {
        Brick brick = new Brick(2, 4, 6);
        InstrumentCase instrumentCase = new InstrumentCase(brick);
        // 乐器盒中竟然可以取出板砖,
        Brick theBrick = (Brick) instrumentCase.getInstrument();
        System.out.println(theBrick);
    }
}