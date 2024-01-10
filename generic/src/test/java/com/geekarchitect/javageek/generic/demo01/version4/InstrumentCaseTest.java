package com.geekarchitect.javageek.generic.demo01.version4;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.Test;

class InstrumentCaseTest {

    @Test
    void getInstrument01() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        InstrumentCase<Flute> instrumentCase = new InstrumentCase<>();
        instrumentCase.setInstrument(flute);
        Flute theFlute = instrumentCase.getInstrument();
        System.out.println(theFlute);

    }

    @Test
    void getInstrument02() {
        Brick brick = new Brick(2, 4, 6);
        InstrumentCase<Brick> instrumentCase = new InstrumentCase<Brick>();
        instrumentCase.setInstrument(brick);
        Brick theBrick = instrumentCase.getInstrument();
        System.out.println(theBrick);
    }

    @Test
    void getInstrument03() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        InstrumentCase instrumentCase = new InstrumentCase();
        //无法从乐器盒中取出Flute对象，只能取出Object对象
        instrumentCase.setInstrument(flute);
        Flute theFlute = (Flute) instrumentCase.getInstrument();
    }

    /**
     * 演示如何简化创建泛型对象的语法 java7引入该语法
     */
    @Test
    void getInstrument011() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        InstrumentCase<Flute> instrumentCase = new InstrumentCase<>();
        instrumentCase.setInstrument(flute);
        // 从乐器盒中取出乐器长笛，不需要强制类型转换，因为使用了泛型，编译器已经知道乐器盒中存放的是长笛。
        Flute theFlute = instrumentCase.getInstrument();
        System.out.println(theFlute);
    }

    @Test
    void getInstrument012() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        Brick brick = new Brick(2, 4, 6);
        InstrumentCase<Flute> instrumentCase = new InstrumentCase();
        instrumentCase.setInstrument(flute);
        // 从乐器盒中取出乐器长笛，不需要强制类型转换，因为使用了泛型，编译器已经知道乐器盒中存放的是长笛。
        Flute theFlute = instrumentCase.getInstrument();
        System.out.println(theFlute);
    }

    @Test
    void getInstrument013() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        Brick brick = new Brick(2, 4, 6);
        InstrumentCase instrumentCase = new InstrumentCase();
        instrumentCase.setInstrument(flute);
        // 从乐器盒中取出乐器长笛，不需要强制类型转换，因为使用了泛型，编译器已经知道乐器盒中存放的是长笛。
        Flute theFlute = (Flute) instrumentCase.getInstrument();
        System.out.println(theFlute);
    }

    /**
     * 演示如何简化创建泛型对象的语法 var关键词 java10 引入该语法
     */
    @Test
    void getInstrument015() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        var instrumentCase = new InstrumentCase<Flute>();
        instrumentCase.setInstrument(flute);
        // 从乐器盒中取出乐器长笛，不需要强制类型转换，因为使用了泛型，编译器已经知道乐器盒中存放的是长笛。
        Flute theFlute = instrumentCase.getInstrument();
        System.out.println(theFlute);
    }
    /**
     * 演示如何简化创建泛型对象的语法 var关键词 java10 引入该语法
     */
    @Test
    void getInstrument016() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        var instrumentCase = new InstrumentCase<>();
        instrumentCase.setInstrument(flute);
        // 从乐器盒中取出乐器长笛，需要强制类型转换，因为在定义对象时，并没有指定泛型变量类型。
        Flute theFlute = (Flute) instrumentCase.getInstrument();
        System.out.println(theFlute);
    }

    @Test
    void getInstrument017() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        @SuppressWarnings("unchecked")
        InstrumentCase<Flute> instrumentCase = new InstrumentCase();
        instrumentCase.setInstrument(flute);
        // 从乐器盒中取出乐器长笛，不需要强制类型转换，因为使用了泛型，编译器已经知道乐器盒中存放的是长笛。
        Flute theFlute = instrumentCase.getInstrument();
        System.out.println(theFlute);
    }
}