package day4;

/**
 * @Author Jinxu Zheng
 * @Date 6/1/2023
 **/
public class Q1 {
    /**
     * 1. Write a class that will only have 3 instances.
     */
    private static int count = 0;


    private Q1() {
        count++;
    }


    public static void getInstance3() {
        if (count >= 3) {
            System.out.println("over three instances");
        }
        new Q1();
    }

    public static void main(String[] args) {
        Q1.getInstance3();
        Q1.getInstance3();
        Q1.getInstance3();
        Q1.getInstance3();
    }

}
