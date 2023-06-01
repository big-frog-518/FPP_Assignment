package day3.p3;

import java.util.Scanner;

/**
 * @Author Jinxu Zheng
 * @Date 5/31/2023
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter C for Circle\n" +
                "Enter R for Rectangle\n" +
                "Enter T for Triangle");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if ("C".equals(s)) {
            System.out.println("Enter the radius of the Circle");
            double radius = Double.valueOf(scanner.nextLine());
            double c = new Circle(radius).computerArea();
            System.out.println("The area of Circle is : " + c);
        }else if ("R".equals(s)) {
            System.out.println("Enter the width of the Rectangle");
            double w = Double.valueOf(scanner.nextLine());
            System.out.println("Enter the height of the Rectangle");
            double h = Double.valueOf(scanner.nextLine());
            double r = new Rectangle(w, h).computerArea();
            System.out.println("The area of Rectangle is : " + r);
        }else if ("T".equals(s)){
                System.out.println("Enter the base of the Triangle");
                double b = Double.valueOf(scanner.nextLine());
                System.out.println("Enter the height of the Triangle");
                double h2 = Double.valueOf(scanner.nextLine());
                double t = new Triangle(b, h2).computerArea();
                System.out.println("The area of Triangle is : " + t);
        }else {
            System.out.println("please check again");
        }
        scanner.close();
    }

}
