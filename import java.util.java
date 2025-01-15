import java.util.ArrayList;
import java.util.Scanner;

// ToDoItem class to represent a task
class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return (isDone ? "[X] " : "[ ] ") + description;
    }
}

// Main application class
public class ToDoListApp {
    private static ArrayList<ToDoItem> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nTo-Do List");
            System.out.println("1. Add a new task");
            System.out.println("2. Mark task as done");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    markTaskAsDone(scanner);
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        toDoList.add(new ToDoItem(description));
        System.out.println("Task added.");
    }

    private static void markTaskAsDone(Scanner scanner) {
        viewTasks();
        System.out.print("Enter task number to mark as done: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
            toDoList.get(taskNumber - 1).markAsDone();
            System.out.println("Task marked as done.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void viewTasks() {
        System.out.println("\nTasks:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }
    }
}
