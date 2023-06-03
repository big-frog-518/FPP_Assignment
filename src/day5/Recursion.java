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
        System.out.println("count: "+countDigits(123));
        System.out.println("sum: " + sumArray(new int[]{1,2,3},3));
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
    static int countDigits(int n){
        int count = 0;
        if (n<10){
            return 1;
        }else {
            return 1+countDigits(n/10);
        }
    }

    static int sumArray(int[] arr, int n) {
        int sum = 0;
        if (n==0){
            return 0;
        }else {
            return arr[n-1]+sumArray(arr,n-1);
        }
    }

}
