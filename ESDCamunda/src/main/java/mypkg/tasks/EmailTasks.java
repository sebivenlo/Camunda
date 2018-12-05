package mypkg.tasks;

import mypkg.TaskClient;
import mypkg.util.Customer;
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
                    String firstName = externalTask.getVariable("firstName");
                    String lastName = externalTask.getVariable("lastName");
                    int yearlyIncome = externalTask.getVariable("yearlyIncome");
                    String email = externalTask.getVariable("emailAdress");

                    System.out.println( firstName + lastName + yearlyIncome + email);
                     Customer customer = new Customer(firstName, lastName, yearlyIncome, email);
                    //emailHelper.sendWelcomeMail(customer);
                    // DO NOT FORGET TO COMPLETE TASK!!!
                    externalTaskService.complete(externalTask);
                })

                .open();
    }

    public void subscribeToDenyLeasingRequest() {
        this.client.getClient().subscribe("deny-leasing-request")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    String firstName = externalTask.getVariable("firstName");
                    String lastName = externalTask.getVariable("lastName");
                    int yearlyIncome = externalTask.getVariable("yearlyIncome");
                    String email = externalTask.getVariable("emailAdress");

                    Customer customer = new Customer(firstName, lastName, yearlyIncome, email);



                })
                .open();
    }


}
