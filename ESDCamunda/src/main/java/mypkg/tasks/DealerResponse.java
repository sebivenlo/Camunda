package mypkg.tasks;

import org.camunda.bpm.client.ExternalTaskClient;

public class DealerResponse {

    ExternalTaskClient myClient;

    public DealerResponse() {

    }

    public DealerResponse(ExternalTaskClient externalTaskClient) {
        myClient = externalTaskClient;
    }

    
}
