package com.example.ct3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HomeController {

    @FXML
    private void handleCalculate(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("calculator.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Calculator");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleTodo(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("todo.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("To-Do List");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleLogout(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Login Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
