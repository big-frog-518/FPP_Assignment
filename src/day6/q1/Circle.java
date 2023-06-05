package day6.q1;

/**
 * @Author Jinxu Zheng
 * @Date 6/5/2023
 **/
public class Circle extends Shape {
    protected double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    //Area of Rectangle = width * height
    //Area of Circle = π * r * r
    //Area of Square = side * side
    //Perimeter of Rectangle = 2 * width + 2 * height
    //Perimeter of Circle = 2 * π * r
    //Perimeter of Square = 4 * side
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
