package day4;

/**
 * @Author Jinxu Zheng
 * @Date 6/1/2023
 **/
public class Q2 {
    private int age;
    private String name;
    private static String sex;


    public void instanceMethod1() {
        System.out.println("instanceMethod1");
    }

    public void instanceMethod2() {
        System.out.println("instanceMethod2");
    }

    public static void staticMethod1() {
        System.out.println("staticMethod1");
    }

    public static void staticMethod2() {
        System.out.println("staticMethod2");
    }

    {
        System.out.println("instance initialization block1");
    }

    {
        System.out.println("instance initialization block2");
    }

    static {
        System.out.println("static initialization block1");
    }

    static {
        System.out.println("static initialization block2");
    }

    public Q2() {
        System.out.println("constructors1");
    }

    public Q2(String name, int age) {
        System.out.println("constructors2");
        this.name = name;
        this.age = age;
    }

    /**
     * 2. Write a class that has 2 instance fields,
     * 1 static field, 2 instance methods,
     * 2 static methods, 2 instance initialization block,
     * 2 static initialization block, and
     * 2 constructors. Create a Main class and inside the main method create 2
     * objects of the class using the different constructor methods. In each method and
     * blocks print some string to console and explain the program execution order.
     */

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        Q2 q1 = new Q2("baby", 1);
    }

    /**
     * explain: 1st static variable
     *          2st static initalization block
     *          3st Instance initialization blocks
     *          4st all of the variable
     *          5st constructors
     */
}



