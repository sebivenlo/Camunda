package mypkg.util;

public class Email {

    private int type;
    private Customer recipient;

    public Email(int type, Customer recipient) {
        this.type = type;
        this.recipient = recipient;
    }

    public void sendWelcomeMail() {
        System.out.println("Welcome email sent to " + recipient.getEmailAdress());
    }
}
