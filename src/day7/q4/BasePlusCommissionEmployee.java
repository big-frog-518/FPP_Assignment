package day7.q4;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }


    @Override
    public Double getPayment() {
        return baseSalary + super.getPayment();
    }
}
