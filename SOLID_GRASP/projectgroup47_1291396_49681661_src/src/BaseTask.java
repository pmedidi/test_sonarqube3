public class BaseTask implements Task {
    private String title;
    private TaskDescription description;
    private int dueDate;
    private boolean status;


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public TaskDescription getDescription() {
        return description;
    }

    @Override
    public boolean getStatus() {
        return false;
    }

    @Override
    public int getDueDate() {
        return dueDate;
    }

}
