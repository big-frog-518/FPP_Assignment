package day3.p3;

/**
 * @Author Jinxu Zheng
 * @Date 5/31/2023
 **/
final public class Rectangle {
    private final double width;
    private final double length;
    public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }

    public double computerArea(){
        return this.width*this.length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
