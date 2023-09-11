package com.geekarchitect.javageek.generic.demo03;

import com.geekarchitect.javageek.generic.Instrument.Instrument;

import java.util.List;

public class InstrumentManager {

    /**
     * 泛型方法，用于遍历乐器列表并打印它们的名称。
     * @param instruments 乐器列表
     * @param <T> 乐器类型，必须是 Instrument 的子类型
     */
    public <T extends Instrument> void printInstrumentNames(T instrument) {
            System.out.println(instrument.getName());
    }
}

