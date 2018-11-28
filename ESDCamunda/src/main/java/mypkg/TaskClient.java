package mypkg;
import org.camunda.bpm.client.*;

public class TaskClient {

    ExternalTaskClient client;

    public TaskClient(){
        final String baseUrl = "http://localhost:8080/engine-rest";

        client = ExternalTaskClient.create()
                .baseUrl(baseUrl)
                .build();

    }

    public ExternalTaskClient getClient() {
        return this.client;
    }


}
