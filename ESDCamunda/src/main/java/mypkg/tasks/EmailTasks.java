package mypkg.tasks;

import com.sendgrid.Email;
import mypkg.TaskClient;
import mypkg.util.EmailHelper;

public class EmailTasks {

    TaskClient client;
    EmailHelper emailHelper;

    public EmailTasks () {

    }

    public EmailTasks (TaskClient client) {
        this.client = client;
        this.emailHelper = new EmailHelper();

    }
    /*
    Subscribe to welcome email task
    DO NOT FORGET
          externalTaskService.complete(externalTask);
    IF YOU DO IT WILL SPAM FOREVER!!!!!
    !!!!
     */
    public void subScribeToWelcomeMail() {
        this.client.getClient().subscribe("send-mail")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                            /*
                            Had to remove this since i'm stupid enough to spam the sengrid enpoint
                            emailHelper.sendWelcomeMail();
                            */
                            System.out.println("Email sent?");
                            externalTaskService.complete(externalTask);
                        })

                .open();
    }
}
