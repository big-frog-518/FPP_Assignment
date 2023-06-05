package day6.q2;

import java.time.LocalDate;

/**
 * @Author Jinxu Zheng
 * @Date 6/5/2023
 **/
public class Professor extends DeptEmployee {
    private int numberOfPublications;
    private static final double PUBLICATION_SALARY = 500.0;


    public Professor(String name, LocalDate hireDate, double salary, int numberOfPublications) {
        super(name, hireDate, salary);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    double computeSalary() {
        return super.computeSalary() + (numberOfPublications * PUBLICATION_SALARY);
    }
}
