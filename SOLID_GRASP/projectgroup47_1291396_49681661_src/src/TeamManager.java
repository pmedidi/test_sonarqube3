import java.util.ArrayList;

public class TeamManager extends BaseTeamMember {
    String name;
    String emailAddress;
    ArrayList<Task> assignedTasks;
    private ArrayList<TeamMember> managing;
    @Override
    public void joinProject(Project project) {
        //implementation for joining a new manager joining project
    }
    @Override
    public void leaveProject(Project project) {
        //implementation for a manager leaving project
    }
    @Override
    public void assignTask(Task task) {
        //implementation for giving a task to a manager
    }
}