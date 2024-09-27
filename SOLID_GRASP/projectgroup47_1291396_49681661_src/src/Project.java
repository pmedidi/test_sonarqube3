import java.util.PriorityQueue;
import java.util.ArrayList;

public class Project {
    private ArrayList<Task> tasks;
    private ArrayList<TeamMember> teamMembers;
    private String name;
    private String description;
    private int startDate;
    private int endDate;

    public void addTask(Task task) {
        tasks.add(task);
    }
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void addTeamMember(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }
    public void removeTeamMember(TeamMember teamMember) {
        teamMembers.remove(teamMember);
    }
}