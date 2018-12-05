package mypkg.tasks;

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
                            emailHelper.sendWelcomeMail();
                            // DO NOT FORGET TO COMPLETE TASK!!!
                            externalTaskService.complete(externalTask);
                        })

                .open();
    }
}
