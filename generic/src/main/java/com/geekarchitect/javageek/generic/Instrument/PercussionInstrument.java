package com.geekarchitect.javageek.generic.Instrument;

/**
 * 打击乐器类，继承自乐器类。
 */
public class PercussionInstrument extends Instrument {
    private String material;

    /**
     * 构造方法，用于创建一个名称为name，材料为material的打击乐器对象。
     *
     * @param name     打击乐器的名称
     * @param material 打击乐器的材料
     */
    public PercussionInstrument(String name, String material) {
        super(name);
        this.material = material;
    }

    /**
     * 返回打击乐器的材料。
     *
     * @return 打击乐器的材料
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 设置打击乐器的材料。
     *
     * @param material 打击乐器的材料
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}

