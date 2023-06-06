package day7.q4;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class Driver {
    public static void main(String[] args) {
        // Employee is abstract class so can not create
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Jinxu", "Zheng", "100", 1000, 1000);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Thao", "Vu", "101", 2000, 10);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Brian", "Siddique", "102", 16.5, 100);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Shelly", "Bastos", "103", 200);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Shelly2", "Bastos", "103", 200);
        Employee[] e = new Employee[5];
        e[0] = basePlusCommissionEmployee;
        e[1] = commissionEmployee;
        e[2] = hourlyEmployee;
        e[3] = salariedEmployee;
        e[4] = salariedEmployee2;
        int totalSalary = 0;
        for (Employee em : e) {
            totalSalary += em.getPayment();
        }
        System.out.println(totalSalary);
    }


}
