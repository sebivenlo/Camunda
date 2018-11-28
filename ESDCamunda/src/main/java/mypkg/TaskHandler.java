package mypkg;

public class TaskHandler {


    TaskClient tc;
    public TaskHandler() {
        tc = new TaskClient();
    }

    public void subscribeToTask(String taskName) {
        tc.client.subscribe(taskName);
    }
}
