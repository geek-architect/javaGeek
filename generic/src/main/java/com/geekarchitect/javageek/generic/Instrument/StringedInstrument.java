package com.geekarchitect.javageek.generic.Instrument;

/**
 * 弦乐器类，继承自乐器类。
 */
public class StringedInstrument extends Instrument {
    private String material;

    /**
     * 构造方法，用于创建一个名称为name，材料为material的弦乐器对象。
     *
     * @param name     弦乐器的名称
     * @param material 弦乐器的材料
     */
    public StringedInstrument(String name, String material) {
        super(name);
        this.material = material;
    }

    /**
     * 返回弦乐器的材料。
     *
     * @return 弦乐器的材料
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 设置弦乐器的材料。
     *
     * @param material 弦乐器的材料
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}
