package day7.q4;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    Double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
