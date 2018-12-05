package mypkg.util;

import com.sendgrid.*;


public class EmailHelper {

    private int type;
    private Customer recipient;
    private final String API_KEY = "LGTM";
    public EmailHelper(int type, Customer recipient) {
        this.type = type;
        this.recipient = recipient;
    }

    public EmailHelper() {
    }

    public void sendWelcomeMail() {
        Email from = new Email("jonas.a.heinz@gmail.com");
        String subject = "Welcome";
        Email to = new Email("jonas.a.heinz@gmail.com");
        Content content = new Content("text/plain", "This is welcome email");
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(this.API_KEY);
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            //System.out.println(response.getStatusCode());
            //System.out.println(response.getBody());
            //System.out.println(response.getHeaders());
        } catch (java.io.IOException ex) {
            System.out.println(ex);
        }
    }

}
