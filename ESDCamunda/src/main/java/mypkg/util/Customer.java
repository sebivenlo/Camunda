package mypkg.util;

public class Customer {

    public String firstName;
    public String lastName;
    public int yearlyIncome;

    public Customer(String firstName, String lastName, int yearlyIncome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearlyIncome = yearlyIncome;

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

    public int getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(int yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }
}
