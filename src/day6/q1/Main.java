package day6.q1;

/**
 * @Author Jinxu Zheng
 * @Date 6/5/2023
 **/
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle("blue", 5.0, 3.0);
        shapes[1] = new Circle("red", 2.5);
        shapes[2] = new Square("green", 4.0);
        shapes[3] = new Rectangle("grey", 6.0, 2.0);
        shapes[4] = new Circle("white", 3.0);
    }

    public static void print(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (Shape s : shapes) {
            totalArea += s.calculateArea();
            totalPerimeter += s.calculatePerimeter();
        }

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
