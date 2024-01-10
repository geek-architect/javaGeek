package com.geekarchitect.javageek.generic.demo03;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.Instrument.Instrument;
import com.geekarchitect.javageek.generic.Instrument.JazzDrum;
import com.geekarchitect.javageek.generic.demo01.version1.Brick;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentManagerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void repair01() {
        Flute flute=new Flute("长笛","铜管乐器","10","铜","C调");
        InstrumentManager instrumentManager=new InstrumentManager();
        //Flute theFlute=instrumentManager.repair(flute);
        //Brick theBrick=instrumentManager.repair(flute)
        //Brick brick=new Brick(10,20,30);
        //Flute theFlute=instrumentManager.repair(brick);
    }
}