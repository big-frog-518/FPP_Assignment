package day6.q1;

/**
 * @Author Jinxu Zheng
 * @Date 6/5/2023
 **/
public class Rectangle extends Shape{
    protected double width;
    protected double height;
    Rectangle(String color,double width,double height){
        super(color);
        this.height = height;
        this.width = width;
    }
    // Area of Rectangle = width * height
    //Area of Circle = π * r * r
    //Area of Square = side * side
    //Perimeter of Rectangle = 2 * width + 2 * height
    //Perimeter of Circle = 2 * π * r
    //Perimeter of Square = 4 * side
    @Override
    public double calculateArea(){
        return width * height;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * width + 2 * height;
    }
}
