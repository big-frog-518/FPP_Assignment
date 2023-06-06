package day7.q4;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    @Override
    public Double getPayment() {
        return grossSales * commissionRate;
    }
}
