package com.geekarchitect.javageek.generic.demo04;

import com.geekarchitect.javageek.generic.Instrument.*;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicianTest  {

    @Test
    void openCase011() {
        Musician musician=new Musician();
        InstrumentCase instrumentCase=new InstrumentCase(new Flute("长笛", "D调", "木头", "银", "C"));
        musician.openCase01(instrumentCase);
    }

    @Test
    void openCase012() {
        Musician musician=new Musician();
        InstrumentCase<Flute> instrumentCase=new InstrumentCase<>(new Flute("长笛", "D调", "木头", "银", "C"));
        musician.openCase01(instrumentCase);
    }


    @Test
    void openCase021() {
        Musician musician=new Musician();
        InstrumentCase<Flute> instrumentCase=new InstrumentCase<>(new Flute("长笛", "D调", "木头", "银", "C"));
        musician.openCase02(instrumentCase);
    }

    @Test
    void openCase022() {
        Musician musician=new Musician();
        InstrumentCase<JazzDrum> instrumentCase=new InstrumentCase<>(new JazzDrum("爵士鼓", "爵士鼓", 8));
        //类型错误，报异常
        //imusician.openCase02(instrumentCase);
    }

    @Test
    void openCase023() {
        Musician musician=new Musician();
        InstrumentCase instrumentCase=new InstrumentCase(new JazzDrum("爵士鼓", "爵士鼓", 8));
        //对于没有使用泛型的InstrumentCase，可以演奏任何乐器，不会报错，入参泛型没有起到作用。
        musician.openCase02(instrumentCase);
    }

    @Test
    void openCase031() {
        Musician musician=new Musician();
        InstrumentCase instrumentCase=new InstrumentCase(new JazzDrum("爵士鼓", "爵士鼓", 8));
        //对于没有使用泛型的InstrumentCase，可以演奏任何乐器，不会报错,入参泛型没有起到作用。
        musician.openCase03(instrumentCase);
    }

    @Test
    void openCase032() {
        Musician musician=new Musician();
        InstrumentCase<WindInstrument> instrumentCase=new InstrumentCase<WindInstrument>(new Flute("长笛", "D调", "木头", "银", "C"));
        //对于没有使用泛型的InstrumentCase，可以演奏任何乐器，不会报错,入参泛型没有起到作用。
        musician.openCase03(instrumentCase);
    }

    @Test
    void openCase033() {
        Musician musician=new Musician();
        InstrumentCase<Flute> instrumentCase=new InstrumentCase<Flute>(new Flute("长笛", "D调", "木头", "银", "C"));
        // InstrumentCase<Flute> 无法协变为InstrumentCase<WindInstrument>
        //musician.openCase03(instrumentCase);
    }

    @Test
    void openCase041() {
        Musician musician=new Musician();
        InstrumentCase<Flute> instrumentCase=new InstrumentCase<Flute>(new Flute("长笛", "D调", "木头", "银", "C"));
        // InstrumentCase<Flute> 可以协变为InstrumentCase<? extends WindInstrument>
        musician.openCase04(instrumentCase);
    }
    @Test
    void openCase042() {
        Musician musician=new Musician();
        InstrumentCase<Piccolo> instrumentCase=new InstrumentCase<Piccolo>(new Piccolo("短笛", "D调", "木头", "银", "C"));
        // InstrumentCase<Piccolo> 可以协变为InstrumentCase<? extends WindInstrument>
        musician.openCase04(instrumentCase);
    }
    @Test
    void openCase043() {
        Musician musician=new Musician();
        InstrumentCase<WindInstrument> instrumentCase=new InstrumentCase<WindInstrument>(new Piccolo("短笛", "D调", "木头", "银", "C"));
        // InstrumentCase<WindInstrument> 可以协变为InstrumentCase<? extends WindInstrument>
        musician.openCase04(instrumentCase);
    }
    @Test
    void openCase044() {
        Musician musician=new Musician();
        InstrumentCase<JazzDrum> instrumentCase=new InstrumentCase<JazzDrum>(new JazzDrum("爵士鼓", "爵士鼓", 8));
        // InstrumentCase<JazzDrum> 不能协变为InstrumentCase<? extends WindInstrument>
        //musician.openCase04(instrumentCase);
    }

    @Test
    void openCase051() {
        Musician musician=new Musician();
        InstrumentCase<Flute> instrumentCase=new InstrumentCase<Flute>(new Flute("长笛", "D调", "木头", "银", "C"));
        //InstrumentCase<Flute> 不可以协变为InstrumentCase<? super WoodwindInstrument>
        //musician.openCase05(instrumentCase);
    }
    @Test
    void openCase052() {
        Musician musician=new Musician();
        InstrumentCase<WoodwindInstrument> instrumentCase=new InstrumentCase<WoodwindInstrument>(new Flute("长笛", "D调", "木头", "银", "C"));
        //InstrumentCase<WoodwindInstrument> 不可以协变为InstrumentCase<? super WoodwindInstrument>
        musician.openCase05(instrumentCase);
    }
    @Test
    void openCase053() {
        Musician musician=new Musician();
        InstrumentCase<PercussionInstrument> instrumentCase=new InstrumentCase<PercussionInstrument>(new JazzDrum("爵士乐","牛皮",8));
        //InstrumentCase<PercussionInstrument> 不可以协变为InstrumentCase<? super WoodwindInstrument>
        //musician.openCase05(instrumentCase);
    }
}