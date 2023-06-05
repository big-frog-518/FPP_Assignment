package day6.q2;

import java.time.LocalDate;
import java.util.Date;

/**
 * @Author Jinxu Zheng
 * @Date 6/5/2023
 **/
public class DeptEmployee {
    protected String name;
    protected double salary;
    protected LocalDate date;

    DeptEmployee(String name, LocalDate now, double salary) {
        this.name = name;
        this.salary = salary;
        this.date = now;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    double computeSalary() {
        return salary;
    }
}
