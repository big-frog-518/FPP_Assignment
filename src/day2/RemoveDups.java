package day2;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author Jinxu Zheng
 * @Date 2023/5/30
 **/
public class RemoveDups {
    /**
     * Write a program called RemoveDups. Create an array which accepts an array of Strings only.
     * Creates a new array in which all duplicate Strings in the original input array have been
     * removed. You should not use any APIs like HashSet, TreeSet etc., Write your own logic.
     * Also, your result should not contain null values.
     * For example, if the input array is
     * ["horse", "dog", "cat", "horse", dog"]
     * then the output would be the following array:
     * ["horse","dog","cat"]
     * @param args
     */
    static void main(String[] args) {
        String[] strings = {"horse", "dog", "cat", "horse", "dog"};
        int num = 0;
        for (int x = 0; x < strings.length-1; x++) {
            for (int y = x+1; y < strings.length; y++) {
                if (Objects.nonNull(strings[x])&&strings[x].equals(strings[y])){
                    num++;
                    strings[y]=null;
                }
            }
        }
        // if need removeDup
        if (num>0){
            String[] removeStr = new String[strings.length-num];
            num = 0;
            for (int i = 0; i < strings.length-1; i++) {
                if (Objects.nonNull(strings[i])){
                    removeStr[num++] = strings[i];
                }
            }
            System.out.println(Arrays.toString(removeStr));
        }else {
            System.out.println(Arrays.toString(strings));
        }
    }
}

