package day2;

/**
 * @Author Jinxu Zheng
 * @Date 2023/5/30
 **/
public class Prog6 {
    /**
     * Create a Java method
     * static int min(int[] arrayOfInts)
     * (in a class Prog6) that outputs the minimum of an array of ints.
     * Example: For the given array of int inputs, method return the result of minimum -22
     * [2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]
     * NOTE: You may not use the sorting tools available in the Java libraries; for instance, you may not call
     * Arrays.sort() to sort the input array. (No credit if you do it this way.)
     */
    static void main(String[] args) {
        System.out.println(min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}));
    }

    static int min(int[] arrayOfInts){
        int minmum= arrayOfInts[0];
        for (int i : arrayOfInts) {
            if (minmum>i){
                minmum = i;
            }
        }
        return minmum;
    }
}
