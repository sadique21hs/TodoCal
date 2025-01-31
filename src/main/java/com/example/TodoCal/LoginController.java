package com.example.TodoCal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField; // Username input

    @FXML
    private TextField userpass; // Password input

    @FXML
    private Button loginButton; // Login button

    // Dummy credentials (Replace this with database authentication if needed)
    private final String VALID_USERNAME = "admin";
    private final String VALID_PASSWORD = "1234";

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = userpass.getText();

        // Check if username and password are correct
        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) loginButton.getScene().getWindow(); // Get current stage
                stage.setScene(new Scene(root));
                stage.setTitle("Home Page");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Show an error message if login fails
            showAlert("Login Failed", "Incorrect Username or Password. Try Again.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
