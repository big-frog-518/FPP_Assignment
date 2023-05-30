package day2;

/**
 * @Author Jinxu Zheng
 * @Date 2023/5/30
 **/
public class Prog1 {
    /**
     * Create a class called Prog1. In the main method of the class, output to the console the result
     * of doing the following two computations:
     * 1. get a random number x in the range 1 .. 9 and compute π
     * x
     * .
     * 2. get a random number y in the range 3 .. 14 and compute y
     * π
     * .
     * Use the RandomNumbers.java class that has been provided for you as an attachment. (Do not
     * use the Random class directly.) Use Math API to solve πx
     * and y
     * π
     * .
     * @param args
     */
    public static void main(String[] args) {
        RandomNumbers rd = new RandomNumbers();
        int x = rd.getRandomInt(1,9);
        int y = rd.getRandomInt(3,14);
        System.out.println(Math.pow(Math.PI,x));
        System.out.println(Math.pow(y,Math.PI));
    }

}
