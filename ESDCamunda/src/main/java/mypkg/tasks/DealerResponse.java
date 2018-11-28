package mypkg.tasks;

import mypkg.util.Customer;
import mypkg.util.Car;
import org.camunda.bpm.client.ExternalTaskClient;

public class DealerResponse {

    ExternalTaskClient myClient;
    public DealerResponse() {
    }

    public DealerResponse(ExternalTaskClient externalTaskClient) {
        myClient = externalTaskClient;
    }

    public void financeResponseTask () {
        myClient.subscribe("finance-response-task")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) ->
                                System.out.println("This is business logic")

                        )
                .open();
    }

    /***
     *
     * @param customer The customer recieving the Response
     * @return
     */
    public int sendPositiveResponse (Customer customer) {

    }
    /***
     *
     * @param customer The customer recieving the Response
     * @return 0 if no error occured, otherwise errorcode
     */
    public int sendNegativeResponse (Customer customer) {

    }

    public void sendCustomerFinanceResponse (Customer customer, Car car) {
        if (this.customerCanFinanceCar(customer, car)) {
            this.sendPositiveResponseTask(customer, car);
        }
        this.sendNegativeResponseTask(customer, car);
    }

    /***
     *
     * @param customer Customer that applies for financing the Car
     * @param car Desired car by the customer
     * @return true of Customer is eligable to finance the car
     */

    public boolean customerCanFinanceCar (Customer customer, Car car) {
        if (customer.yearlyIncome / car.getPrice() < 2) {
            return false;
        }
        return true;
    }
}
