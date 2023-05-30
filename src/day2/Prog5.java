package day2;

import java.util.Arrays;

/**
 * @Author Jinxu Zheng
 * @Date 2023/5/30
 **/
public class Prog5 {
    /**
     * Create a class Prog5 and implement the given method which takes the two arrays of inputs
     * and combine the two arrays into single array.
     * public int[] combine(int[] a, int[] b);
     * Example: Input array a : [5,6,-4,3,1]
     * Input array b: [ 3,8,9,11]
     * Output arrays: [ 5,6,-4,3,1, 3,8,9,11]
     */
    static void main(String[] args) {
        int[] combine = combine(new int[]{5, 6, -4, 3, 1}, new int[]{3, 8, 9, 11});
        System.out.println(Arrays.toString(combine));
    }
    static int[] combine(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            result[i]= a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length+i]= b[i];
        }
        return result;
    }
}
