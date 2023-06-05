package day6.q2;

import java.time.LocalDate;

/**
 * @Author Jinxu Zheng
 * @Date 6/5/2023
 **/
public class Secretary extends DeptEmployee {
    private double overtimeHours;

    Secretary(String name, LocalDate now,double salary,double overtimeHours) {
        super(name, now,salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    double computeSalary() {
        double v = super.computeSalary();
        return v+12*overtimeHours;
    }
}
