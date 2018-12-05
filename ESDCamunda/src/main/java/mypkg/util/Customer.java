package mypkg.util;

public class Customer {

    public String firstName;
    public String lastName;
    public int yearlyIncome;
    public String emailAdress;

    public Customer(String firstName, String lastName, int yearlyIncome, String emailAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearlyIncome = yearlyIncome;
        this.emailAdress = emailAdress;

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

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
