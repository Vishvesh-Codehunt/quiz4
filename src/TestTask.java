mport java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    void testAssignTo() {
        Task task = new Task("Task1", "Test1", LocalDateTime.now().plusDays(1));
        task.assignTo("Vishvesh Patel");
        assertEquals("John Doe", task.getAssignedTo());
    }

    @Test
    void testAssignToThrowsException() {
        Task task = new Task("Test2", "Test2", LocalDateTime.now().plusDays(1));
        assertThrows(IllegalArgumentException.class, () -> task.assignTo(""));
    }

    @Test
    void testUpdateStatus() {
        Task task = new Task("Test3", "Test3", LocalDateTime.now().plusDays(1));
        task.updateStatus("In Progress");
        assertEquals("In Progress", task.getStatus());
    }

    @Test
    void testUpdateStatusThrowsException() {
        Task task = new Task("Test4", "Test4", LocalDateTime.now().plusDays(1));
        assertThrows(IllegalArgumentException.class, () -> task.updateStatus("Invalid"));
    }

    @Test
    void testIsOverdue() {
        Task task = new Task("Test5", "Test5", LocalDateTime.now().minusDays(1));
        assertTrue(task.isOverdue());
    }

    @Test
    void testIsNotOverdue() {
        Task task = new Task("Test6", "Test6", LocalDateTime.now().plusDays(1));
        assertFalse(task.isOverdue());
    }
}