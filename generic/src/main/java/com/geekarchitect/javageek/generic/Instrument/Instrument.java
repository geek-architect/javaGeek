package com.geekarchitect.javageek.generic.Instrument;

/**
 * 乐器类，是所有乐器的基类。
 */
public class Instrument {
    private String name;

    /**
     * 构造方法，用于创建一个名称为name的乐器对象。
     *
     * @param name 乐器的名称
     */
    public Instrument(String name) {
        this.name = name;
    }

    /**
     * 返回乐器的名称。
     *
     * @return 乐器的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置乐器的名称。
     *
     * @param name 乐器的名称
     */
    public void setName(String name) {
        this.name = name;
    }
}
