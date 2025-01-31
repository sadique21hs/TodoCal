package com.example.TodoCal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorController {

    @FXML
    private TextField num1; // First number input

    @FXML
    private TextField num2; // Second number input

    @FXML
    private TextField result; // Result output

    @FXML
    private TextField operation; // Shows the chosen operation (+, -, *, /)

    private String selectedOperator = ""; // Stores the selected operator

    @FXML
    private void handleOperator(ActionEvent event) {
        // Get the text from the clicked button
        Button clickedButton = (Button) event.getSource();
        selectedOperator = clickedButton.getText();

        // Update the operation text field
        operation.setText(selectedOperator);
    }

    @FXML
    private void calculateResult(ActionEvent event) {
        try {
            double number1 = Double.parseDouble(num1.getText());
            double number2 = Double.parseDouble(num2.getText());
            double calcResult = 0;

            switch (selectedOperator) {
                case "+":
                    calcResult = number1 + number2;
                    break;
                case "-":
                    calcResult = number1 - number2;
                    break;
                case "*":
                    calcResult = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        calcResult = number1 / number2;
                    } else {
                        result.setText("Error: Division by zero");
                        return;
                    }
                    break;
                default:
                    result.setText("Select an operation");
                    return;
            }

            // Show result
            result.setText(String.valueOf(calcResult));

        } catch (NumberFormatException e) {
            result.setText("Invalid input");
        }
    }

    @FXML
    private void goBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Home Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
