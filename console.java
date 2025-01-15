// User.java
public class User {
    private String username;
    private String password;

    // Constructor, getters, and setters
}

// Course.java
public class Course {
    private String title;
    private String description;

    // Constructor, getters, and setters
}

// Quiz.java
public class Quiz {
    private String question;
    private String[] options;
    private int correctAnswer;

    // Constructor, getters, and setters
}

// UserService.java
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void registerUser(String username, String password) {
        // Register logic
    }

    public User loginUser(String username, String password) {
        // Login logic
        return null;
    }
}

// CourseService.java
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(String title, String description) {
        // Add course logic
    }

    public List<Course> getAllCourses() {
        return courses;
    }
}

// QuizService.java
import java.util.ArrayList;
import java.util.List;

public class QuizService {
    private List<Quiz> quizzes = new ArrayList<>();

    public void addQuiz(String question, String[] options, int correctAnswer) {
        // Add quiz logic
    }

    public List<Quiz> getAllQuizzes() {
        return quizzes;
    }
}

// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        CourseService courseService = new CourseService();
        QuizService quizService = new QuizService();

        Scanner scanner = new Scanner(System.in);
        // Basic menu logic for user interaction
    }
}
