registerButton.addActionListener(e -> {
    String username = userText.getText().trim();
    String email = emailText.getText().trim();

    if (username.isEmpty() || email.isEmpty()) {
        messageLabel.setText("Error: All fields are required!");
    } else if (!email.contains("@")) {
        messageLabel.setText("Error: Invalid email format!");
    } else {
        messageLabel.setText("Registration successful!");
    }
});
