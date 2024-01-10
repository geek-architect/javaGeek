package com.geekarchitect.javageek.generic.demo06;

/**
 * 乐器盒类，用于存放各种乐器。
 * @param <T> 存储的乐器类型
 */
public class InstrumentCase<T> {
    private T instrument;

    /**
     * 构造方法，用于创建一个包含指定乐器的乐器盒对象。
     * @param instrument 要存放的乐器
     */
    public InstrumentCase(T instrument) {
        this.instrument = instrument;
    }

    /**
     * 返回乐器盒中存放的乐器。
     * @return 存放的乐器
     */
    public T getInstrument() {
        return instrument;
    }

    /**
     * 设置乐器盒中存放的乐器。
     * @param instrument 要存放的乐器
     */
    public void setInstrument(T instrument) {
        this.instrument = instrument;
    }

    public T createInstrument() {
        //因为泛型擦除，所以这里不能创建泛型类型的对象
        //return new T();
        return null;
    }
}

