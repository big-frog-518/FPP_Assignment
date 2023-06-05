package day6.q2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @Author Jinxu Zheng
 * @Date 6/5/2023
 **/
public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Brian", LocalDate.now(),1000,1);
        Professor p2 = new Professor("Bruce", LocalDate.now(), 2000, 1);
        Professor p3 = new Professor("David", LocalDate.now(), 3000, 1);
        Secretary s1 = new Secretary("Emily", LocalDate.now(), 4000,10);
        Secretary s2 = new Secretary("Michael", LocalDate.now(), 4000,10);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        System.out.println("do u want to see the the sum of all professor and secretary");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if ("Y".equals(s)) {
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total Salary: " + totalSalary);
        }
    }
}
