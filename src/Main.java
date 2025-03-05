import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create a task
        Task task = new Task("Complete project code", "Task1", LocalDateTime.now().plusDays(2));

        // Assign the task
        task.assignTo("Vishvesh");

        // Update status
        task.updateStatus("In Progress");

        // Check if overdue
        System.out.println("Task assigned to: " + task.getAssignedTo());
        System.out.println("Task status: " + task.getStatus());
        System.out.println("Is task overdue? " + task.isOverdue());
    }
}
