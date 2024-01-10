package com.geekarchitect.javageek.generic.Instrument;

/**
 * 长笛类，是一种通过在管内振动空气柱来产生声音的木管乐器。
 */
public class Flute extends WoodwindInstrument {
    private String key;

    /**
     * 使用给定的名称、材料、管长、簧片材料和键位构造一个新的 Flute 对象。
     *
     * @param name         长笛的名称
     * @param material     构造长笛使用的材料
     * @param tubeLength   长笛的管长
     * @param reedMaterial 长笛的簧片材料
     * @param key          长笛的键位
     */
    public Flute(String name, String material, String tubeLength, String reedMaterial, String key) {
        super(name, material, tubeLength, reedMaterial);
        this.key = key;
    }



    /**
     * 返回长笛的键位。
     *
     * @return 长笛的键位
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置长笛的键位。
     *
     * @param key 长笛的键位
     */
    public void setKey(String key) {
        this.key = key;
    }
    //toString方法
    @Override
    public String toString() {
        return "Flute{" +
                "key='" + key + '\'' +
                ", name='" + getName() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", tubeLength='" + getTubeLength() + '\'' +
                ", reedMaterial='" + getReedMaterial() + '\'' +
                '}';
    }
}
