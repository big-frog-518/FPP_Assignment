package day7.q4;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    Double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
