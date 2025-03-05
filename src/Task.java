import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private String assignedTo;
    private String status;
    private LocalDateTime dueDate;

    public Task(String title, String description, LocalDateTime dueDate) {
        this.title = title;
        this.description = description;
        this.status = "Pending";
        this.dueDate = dueDate;
    }

    public void assignTo(String teamMember) {
        if (teamMember == null || teamMember.isEmpty()) {
            throw new IllegalArgumentException("Team member cannot be null or empty");
        }
        this.assignedTo = teamMember;
    }

    public void updateStatus(String newStatus) {
        if (!newStatus.equals("Pending") && !newStatus.equals("In Progress") && !newStatus.equals("Completed")) {
            throw new IllegalArgumentException("Invalid status");
        }
        this.status = newStatus;
    }

    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(dueDate);
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getStatus() {
        return status;
    }
}
