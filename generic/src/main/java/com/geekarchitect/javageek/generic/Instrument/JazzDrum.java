package com.geekarchitect.javageek.generic.Instrument;

/**
 * 爵士鼓类，继承自打击乐器类。
 */
public class JazzDrum extends PercussionInstrument {
    private int numberOfPieces;

    /**
     * 构造方法，用于创建一个名称为name，材料为material，部件数为numberOfPieces的爵士鼓对象。
     *
     * @param name           爵士鼓的名称
     * @param material       爵士鼓的材料
     * @param numberOfPieces 爵士鼓的部件数
     */
    public JazzDrum(String name, String material, int numberOfPieces) {
        super(name, material);
        this.numberOfPieces = numberOfPieces;
    }

    /**
     * 返回爵士鼓的部件数。
     *
     * @return 爵士鼓的部件数
     */
    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * 设置爵士鼓的部件数。
     *
     * @param numberOfPieces 爵士鼓的部件数
     */
    public void setNumberOfPieces(int numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "JazzDrum{" +
                "numberOfPieces=" + numberOfPieces +
                ", name='" + super.getName() + '\'' +
                ", material='" + super.getMaterial() + '\'' +
                '}';
    }
}

