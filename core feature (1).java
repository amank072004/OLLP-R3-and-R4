import javax.swing.*;
import java.awt.*;

public class LanguageLearningApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Online Language Learning Platform");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating core components
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(4, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailText = new JTextField();
        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel();

        panel.add(userLabel);
        panel.add(userText);
        panel.add(emailLabel);
        panel.add(emailText);
        panel.add(new JLabel()); // empty cell
        panel.add(registerButton);
        panel.add(messageLabel);

        frame.setVisible(true);
    }
}
