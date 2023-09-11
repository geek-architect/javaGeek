package com.geekarchitect.javageek.generic.demo02;

import com.geekarchitect.javageek.generic.Instrument.Flute;
import com.geekarchitect.javageek.generic.Instrument.JazzDrum;
import com.geekarchitect.javageek.generic.demo02.InstrumentCase;
import org.junit.jupiter.api.Test;

class InstrumentCaseTest {

    @Test
    public void testGetInstrument() {
        Flute flute = new Flute("Flute", "Wood", "60cm", "Metal", "C");
        JazzDrum jazzDrum = new JazzDrum("JazzDrum", "Wood",  5);
        InstrumentCase<Flute, JazzDrum> instrumentCase = new InstrumentCase<>(flute, jazzDrum);
        Flute theFlute = instrumentCase.getInstrument1();
        JazzDrum theJazzDrum = instrumentCase.getInstrument2();
        System.out.println(theFlute);
        System.out.println(theJazzDrum);
    }
}