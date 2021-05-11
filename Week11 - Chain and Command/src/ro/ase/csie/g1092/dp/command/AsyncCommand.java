package ro.ase.csie.g1092.dp.command;

public class AsyncCommand extends AbstractAsyncTask {

    String taskName;
    int priority;
    GameModuleInterface moduleInterface;

    public AsyncCommand(String taskName,GameModuleInterface moduleInterface) {
        this.taskName = taskName;
        this.moduleInterface = moduleInterface;
    }

    @Override
    public void asyncExecute() {
        this.moduleInterface.doTask(this.taskName);
    }
}
