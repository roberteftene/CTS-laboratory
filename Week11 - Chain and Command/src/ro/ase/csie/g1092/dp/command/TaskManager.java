package ro.ase.csie.g1092.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<AbstractAsyncTask> tasks = new ArrayList<>();
    public void addAsyncTask(AbstractAsyncTask abstractAsyncTask) {
        tasks.add(abstractAsyncTask);
    }
    public void execute() {
        if(tasks.size() > 0) {
            AbstractAsyncTask taskToExecute = tasks.get(0);
            if (taskToExecute != null) {
                tasks.remove(taskToExecute);
                taskToExecute.asyncExecute();
            }
        }
    }
}
