package com.geekarchitect.javageek.generic.demo06;

import com.geekarchitect.javageek.generic.Instrument.Instrument;

import java.util.function.Supplier;

/**
 * @author 极客架构师@吴念
 * @createTime 2023/9/14
 */
public class ClassAsFactory<T> implements Supplier<T> {
    Class<T> kind;
    ClassAsFactory(Class<T> kind) {
        this.kind = kind;
    }
    @Override public T get() {
        try {
            //需要无参构造器
            return kind.getConstructor().newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ClassAsFactory<Instrument> instrumentClassAsFactory = new ClassAsFactory<>(Instrument.class);
        //Instrument 必须有无参构造器
        Instrument instrument = instrumentClassAsFactory.get();
        System.out.println(instrument);
    }
}
