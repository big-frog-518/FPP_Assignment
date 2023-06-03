package day5;

/**
 * @Author Jinxu Zheng
 * @Date 6/2/2023
 **/
public class Recursion {
    /**
     * 1. Write a method to display the digits of a given integer value n in reverse order.
     * 2. Write a method to count the number of digits in an integer value n. Assume that n is
     * nonnegative and represented in base ten.
     * 3. Write a method to compute the sum of all elements of the array arr, of size n.
     */

    public static void main(String[] args) {
        displayReverseNum(123);
    }


    // q1
    static void displayReverseNum(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            int digit = n % 10;
            System.out.print(digit + " ");
            displayReverseNum(n / 10);
        }
    }

    //q2
    static void countDigits(){

    }


}
