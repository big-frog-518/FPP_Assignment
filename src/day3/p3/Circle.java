package day3.p3;

/**
 * @Author Jinxu Zheng
 * @Date 5/31/2023
 **/
final public class Circle {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computerArea() {
        return Math.PI * radius * radius;
    }
}
