package mypkg.util;

import com.sendgrid.*;


public class EmailHelper {

    private int type;
    private Customer recipient;
    private final String API_KEY = "LGTM";

    public EmailHelper() {
    }


    public void sendMail(Mail mail) {
        SendGrid sg = new SendGrid(this.API_KEY);
        Request request = new Request();

        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            //Response response = sg.api(request);
            //System.out.println(response.getStatusCode());
            //System.out.println(response.getBody());
            //System.out.println(response.getHeaders());
        } catch (java.io.IOException ex) {
            System.out.println(ex);
        }
    }

    public void sendWelcomeMail(Customer customer) {
        Email from = new Email("j.heinz@student.fontys.nl");
        String subject = "Welcome";
        Email to = new Email(customer.getEmailAdress());
        Content content = new Content("text/plain", "This is welcome email");
        Mail mail = new Mail(from, subject, to, content);

        this.sendMail(mail);
    }

    public void sendDenyEmail(Customer customer) {
        Email from = new Email("j.heinz@student.fontys.nl");
        String subject = "Leasing request denied";
        Email to = new Email(customer.getEmailAdress());
        Content content = new Content("text/plain", "Your request for a leasing got denied.");
        Mail mail = new Mail(from, subject, to, content);

        this.sendMail(mail);
    }

    public void sendApprovalMail(Customer customer) {
        Email from = new Email("j.heinz@student.fontys.nl");
        String subject = "Leasing request approved";
        Email to = new Email(customer.getEmailAdress());
        Content content = new Content("text/plain", "Your request for a leasing got approved.");
        Mail mail = new Mail(from, subject, to, content);

        this.sendMail(mail);
    }

}
