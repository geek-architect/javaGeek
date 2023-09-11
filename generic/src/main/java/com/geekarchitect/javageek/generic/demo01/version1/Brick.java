package com.geekarchitect.javageek.generic.demo01.version1;

/**
 * Brick类，表示一个矩形砖块对象。
 */
public class Brick {
    private double length; // 砖块的长度
    private double width; // 砖块的宽度
    private double height; // 砖块的高度

    /**
     * 构造函数，用于创建一个给定长度、宽度和高度的新Brick对象。
     *
     * @param length 砖块的长度
     * @param width  砖块的宽度
     * @param height 砖块的高度
     */
    public Brick(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * 返回砖块的长度。
     *
     * @return 砖块的长度
     */
    public double getLength() {
        return length;
    }

    /**
     * 设置砖块的长度。
     *
     * @param length 砖块的长度
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 返回砖块的宽度。
     *
     * @return 砖块的宽度
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置砖块的宽度。
     *
     * @param width 砖块的宽度
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 返回砖块的高度。
     *
     * @return 砖块的高度
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置砖块的高度。
     *
     * @param height 砖块的高度
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 返回砖块的体积。
     *
     * @return 砖块的体积
     */
    public double getVolume() {
        return length * width * height;
    }
}

