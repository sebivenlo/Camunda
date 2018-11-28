package mypkg.tasks;

import mypkg.util.Customer;
import org.camunda.bpm.client.ExternalTaskClient;

public class DealerResponse {

    ExternalTaskClient myClient;

    public DealerResponse() {

    }

    public DealerResponse(ExternalTaskClient externalTaskClient) {
        myClient = externalTaskClient;
    }

    public void sendNegativeResponseTask() {

    }

    public void sendNegativeResponse(Customer customer) {
        System.out.println("Negative Response email sent to customer" + customer);
    }
}
