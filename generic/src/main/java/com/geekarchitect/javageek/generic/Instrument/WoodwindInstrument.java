package com.geekarchitect.javageek.generic.Instrument;

/**
 * 木管乐器类，是一种通过在管内振动空气柱来产生声音的乐器。
 */
public class WoodwindInstrument extends WindInstrument {
    private String reedMaterial;

    /**
     * 使用给定的名称、材料、管长和簧片材料构造一个新的 WoodwindInstrument 对象。
     *
     * @param name         木管乐器的名称
     * @param material     构造木管乐器使用的材料
     * @param tubeLength   木管乐器的管长
     * @param reedMaterial 木管乐器的簧片材料
     */
    public WoodwindInstrument(String name, String material, String tubeLength, String reedMaterial) {
        super(name, material, tubeLength);
        this.reedMaterial = reedMaterial;
    }

    /**
     * 返回木管乐器的簧片材料。
     *
     * @return 木管乐器的簧片材料
     */
    public String getReedMaterial() {
        return reedMaterial;
    }

    /**
     * 设置木管乐器的簧片材料。
     *
     * @param reedMaterial 木管乐器的簧片材料
     */
    public void setReedMaterial(String reedMaterial) {
        this.reedMaterial = reedMaterial;
    }
}

