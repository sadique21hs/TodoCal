package com.example.TodoCal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoController {

    @FXML
    private TextField Task; // Input field for adding a new task

    @FXML
    private Button addbtn; // Button to add a task

    @FXML
    private Button backbtn; // Button to go back

    @FXML
    private TextField TotalTask; // Shows total number of tasks

    @FXML
    private TextArea textarea; // Displays all tasks

    private List<String> taskList = new ArrayList<>(); // Stores tasks

    @FXML
    private void addTask(ActionEvent event) {
        String newTask = Task.getText().trim(); // Get the task input
        if (!newTask.isEmpty()) {
            taskList.add(newTask); // Add task to the list
            updateTaskList(); // Update task area
            Task.clear(); // Clear input field
        }
    }

    private void updateTaskList() {
        StringBuilder tasks = new StringBuilder();
        for (int i = 0; i < taskList.size(); i++) {
            tasks.append(i + 1).append(". ").append(taskList.get(i)).append("\n");
        }
        textarea.setText(tasks.toString()); // Update text area
        TotalTask.setText(String.valueOf(taskList.size())); // Update total tasks
    }

    @FXML
    private void goBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backbtn.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Home Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
