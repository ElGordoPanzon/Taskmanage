import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        // Initialize a list of Task objects
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Pay bills", Priority.HIGH));
        tasks.add(new Task("Read a book", Priority.LOW));
        tasks.add(new Task("Submit report", Priority.MEDIUM));
        tasks.add(new Task("Go for a walk", Priority.LOW));
        tasks.add(new Task("Prepare presentation", Priority.HIGH));

        // Sort tasks by priority from HIGH to LOW
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t2.getPriority().ordinal() - t1.getPriority().ordinal();
            }
        });

        // Display the sorted list of tasks
        System.out.println("Tasks sorted by priority (from HIGH to LOW):");
        for (Task task : tasks) {
            task.displayTaskDetails();
        }
    }
}