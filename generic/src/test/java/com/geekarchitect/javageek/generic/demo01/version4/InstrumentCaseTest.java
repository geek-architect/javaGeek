package com.geekarchitect.javageek.generic.demo01.version4;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.Test;

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
        InstrumentCase<Brick> instrumentCase = new InstrumentCase<>(brick);
        // 从乐器盒中居然可以取出搬砖
        Brick theBrick = instrumentCase.getInstrument();
        System.out.println(theBrick);
    }

    @Test
    void getInstrument03() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        InstrumentCase instrumentCase = new InstrumentCase(flute);
        //无法从乐器盒中取出Flute对象，只能取出Object对象
        //Flute theFlute = instrumentCase.getInstrument();
    }
}