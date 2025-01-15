import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataValidationExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Validation Example");
        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(20);

        JButton submitButton = new JButton("Submit");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(submitButton);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String ageText = ageField.getText();
                if (name.isEmpty() || !name.matches("[A-Za-z ]+")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid name.");
                } else if (!ageText.matches("\\d+")) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid age.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Data submitted successfully!");
                }
            }
        });
    }
}
