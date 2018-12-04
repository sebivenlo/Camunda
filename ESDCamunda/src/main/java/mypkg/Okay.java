package mypkg;
import java.util.logging.Logger;

import mypkg.tasks.EmailTasks;
import mypkg.util.EmailHelper;
import org.camunda.bpm.client.*;

public class Okay {
    private final static Logger LOGGER = Logger.getLogger(Okay.class.getName());

    public static void main(String[] args) {

        EmailTasks emailTasks;
       /* ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://172.17.0.1:8080/engine-rest")
                .build();
        // subscribe to an external task topic as specified in the process
        client.subscribe("charge-card")
                .lockDuration(1000) // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {
                    // Put your business logic here
                    System.out.println("asd");

                    // Get a process variable
                    String item = (String) externalTask.getVariable("item");
                    Long amount = (Long) externalTask.getVariable("amount");
                    LOGGER.info("Charging credit card with an amount of '" + amount + "'€ for the item '" + item + "'...");

                    // Complete the task
                    externalTaskService.complete(externalTask);
                })
                .open(); */

        TaskClient taskClient = new TaskClient();
        emailTasks = new EmailTasks(taskClient);
        emailTasks.subScribeToWelcomeMail();

    }
    public static void subscribeToTasks(){
    }
}