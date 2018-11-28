package mypkg.tasks;

import mypkg.TaskClient;
import org.camunda.bpm.client.ExternalTaskClient;

public class CarMatch {

    ExternalTaskClient myClient;

    public CarMatch(){

    }

    public CarMatch(TaskClient taskClient) {
        myClient = taskClient.getClient();
    }

    public void getCarMatchTask(){
        myClient.subscribe("get-car-match")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) ->
                        System.out.println("GET CAR MATCH TASK FUNCTION")
                )
                .open();
    }
}
