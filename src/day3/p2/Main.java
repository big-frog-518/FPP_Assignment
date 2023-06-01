package day3.p2;

import java.text.DateFormat;
import java.util.Scanner;

/**
 * @Author Jinxu Zheng
 * @Date 5/31/2023
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Please,enter your first name:");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Please,enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please,enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14");
        String birth = scanner.nextLine();
        HeartRates heartRates = new HeartRates(firstName, lastName, birth);
        Integer year = Integer.valueOf(birth.substring(0, birth.indexOf("-")));
        int age = heartRates.getPersonAge(year);
        int mhr = heartRates.getMhr(age);
        // print heart rate
        heartRates.printTargetHeartRate(mhr);
        // set this two field value in order to toString print
        heartRates.setAge(age);
        heartRates.setMhr(mhr);
        System.out.println(heartRates);
        scanner.close();
    }
}
