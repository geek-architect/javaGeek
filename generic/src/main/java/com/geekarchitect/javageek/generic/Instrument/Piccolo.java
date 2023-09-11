package com.geekarchitect.javageek.generic.Instrument;

/**
 * 短笛类，是一种通过在管内振动空气柱来产生声音的木管乐器。
 */
public class Piccolo extends WoodwindInstrument {
    private String key;

    /**
     * 使用给定的名称、材料、管长、簧片材料和键位构造一个新的 Piccolo 对象。
     *
     * @param name         短笛的名称
     * @param material     构造短笛使用的材料
     * @param tubeLength   短笛的管长
     * @param reedMaterial 短笛的簧片材料
     * @param key          短笛的键位
     */
    public Piccolo(String name, String material, String tubeLength, String reedMaterial, String key) {
        super(name, material, tubeLength, reedMaterial);
        this.key = key;
    }

    /**
     * 返回短笛的键位。
     *
     * @return 短笛的键位
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置短笛的键位。
     *
     * @param key 短笛的键位
     */
    public void setKey(String key) {
        this.key = key;
    }
}
