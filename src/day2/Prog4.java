package day2;

/**
 * @Author Jinxu Zheng
 * @Date 2023/5/30
 **/
public class Prog4 {
    /**
     * Create a class Prog4. Inside its main method, create float variables to store each of the following
     * numbers:
     * 1.27, 3.881, 9.6
     * Output to the console the following two values:
     * 1. the sum of the floats as an integer, obtained by casting the sum to type int
     * 2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the
     * Math.round function
     * @param args
     */
    public static void main(String[] args) {
        float num1 = 1.27F;
        float num2 = 3.881F;
        float num3 = 9.6F;
        float sum = num1 + num2 + num3;
        System.out.println((int)sum);
        System.out.println(Math.round(sum));
    }
}
