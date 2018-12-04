package mypkg.tasks;

import com.sendgrid.Email;
import mypkg.TaskClient;
import org.camunda.bpm.client.ExternalTaskClient;

public class EmailTasks {

    TaskClient client;


    public EmailTasks () {

    }

    public EmailTasks (TaskClient client) {
        this.client = client;

    }

    public subScribeToWelcomeMail() {
        this.client.getClient().subscribe("send-mail")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) ->

                        )
                .open();
    }
}
