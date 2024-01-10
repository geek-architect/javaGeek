package com.geekarchitect.javageek.generic.demo03;

import com.geekarchitect.javageek.generic.Instrument.Instrument;

import java.util.List;

public class InstrumentManager {
    public <T extends Instrument> T repair(T instrument) {
       System.out.println("正在维修" + instrument.getName());
       return instrument;
    }
}

