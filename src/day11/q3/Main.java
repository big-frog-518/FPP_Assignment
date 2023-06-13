package day11.q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Jinxu Zheng
 * @Date 6/13/2023
 */
public class Main {
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();
        marketingList.add(new Marketing("Jack", "A", 1000));
        marketingList.add(new Marketing("Brian", "B", 999));
        marketingList.add(new Marketing("Oven", "C", 1100));
        marketingList.add(new Marketing("Jim", "D", 1001));
        //  Print the size of the list.
        System.out.println("Size of the list: " + marketingList.size());

        // Printing the contents of the list
        System.out.println("Contents of the list:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing);
        }
        // remove
        marketingList.remove(0);

        marketingList.sort(Comparator.comparingDouble(Marketing::getSalesAmount));

        // Printing the sorted list
        System.out.println("Sorted list by salesAmount:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing);
        }

        // Sort the list in natural order using employeename with the criteria of the
        //employee who achieves more than $1000 of salesamount. Write a method
        //to retrieve the result of getting list of employees have more than $1000
        //sales. Then do the sorting on this result list.
        List<Marketing> filteredList = listMoreThan1000(marketingList);
        filteredList.sort(Comparator.comparing(Marketing::getEmployeeName));

        System.out.println("Sorted list of employees with salesAmount > $1000:");
        for (Marketing marketing : filteredList) {
            System.out.println(marketing);
        }
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
}
