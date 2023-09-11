package com.geekarchitect.javageek.generic.Instrument;

/**
 * 管乐器类，是一种通过在管内振动空气柱来产生声音的乐器。
 */
public class WindInstrument extends Instrument {
    private String material;
    private String tubeLength;

    /**
     * 使用给定的名称、材料和管长构造一个新的 WindInstrument 对象。
     *
     * @param name       管乐器的名称
     * @param material   构造管乐器使用的材料
     * @param tubeLength 管乐器的管长
     */
    public WindInstrument(String name, String material, String tubeLength) {
        super(name);
        this.material = material;
        this.tubeLength = tubeLength;
    }

    /**
     * 返回构造管乐器使用的材料。
     *
     * @return 构造管乐器使用的材料
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 设置构造管乐器使用的材料。
     *
     * @param material 构造管乐器使用的材料
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * 返回管乐器的管长。
     *
     * @return 管乐器的管长
     */
    public String getTubeLength() {
        return tubeLength;
    }

    /**
     * 设置管乐器的管长。
     *
     * @param tubeLength 管乐器的管长
     */
    public void setTubeLength(String tubeLength) {
        this.tubeLength = tubeLength;
    }
}
