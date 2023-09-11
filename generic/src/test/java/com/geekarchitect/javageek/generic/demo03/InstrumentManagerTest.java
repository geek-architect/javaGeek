package com.geekarchitect.javageek.generic.demo03;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.Instrument.Instrument;
import com.geekarchitect.javageek.generic.Instrument.JazzDrum;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentManagerTest {

    @Test
    void printInstrumentNames01() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        InstrumentManager manager = new InstrumentManager();
        manager.printInstrumentNames(flute);
    }
    @Test
    void printInstrumentNames02() {
        Brick brick = new Brick(10, 20, 30);
        InstrumentManager manager = new InstrumentManager();
        //泛型方法对方法参数的类型有要求，所以这里会报错
        //manager.printInstrumentNames(brick);
    }
}