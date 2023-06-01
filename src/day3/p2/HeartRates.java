package day3.p2;

import java.time.LocalDate;

/**
 * @Author Jinxu Zheng
 * @Date 5/31/2023
 **/
public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int mhr;



    private int age;

    private final double ASSIGN_LOWER_BOUNDARY = 0.5;
    private final double ASSIGN_UPPER_BOUNDARY = 0.85;
    private final int ASSIGN_RESTING_HEART_RATE = 70;

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getMhr() {
        return mhr;
    }

    public void setMhr(int mhr) {
        this.mhr = mhr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    int getPersonAge(int birthYears) {
        return LocalDate.now().getYear() - birthYears;
    }

    int getMhr(int age) {
        return 220 - age;
    }

    void printTargetHeartRate(int mhr) {
        int ahr = mhr - ASSIGN_RESTING_HEART_RATE;
        double lbthr = ahr * ASSIGN_LOWER_BOUNDARY + ASSIGN_RESTING_HEART_RATE;
        double ubthr = ahr * ASSIGN_UPPER_BOUNDARY + ASSIGN_RESTING_HEART_RATE;
        System.out.println("The Target Heart Rate Range is between" + " " + lbthr + " " + "and" + " " + ubthr);
    }

    // override the to String
    @Override
    public String toString() {
        return
                "First Name : " + firstName + '\n' +
                        "Last Name : " + lastName + '\n' +
                        "Age : " + age + '\n' +
                        "Date of Birth : " + dateOfBirth + '\n' +
                        "Maximum Heart Rate ：" + mhr + '\n';
    }
}
