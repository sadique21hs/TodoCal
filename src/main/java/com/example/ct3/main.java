package com.example.ct3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Login Page");
        primaryStage.setScene(new Scene(root, 800, 500)); // Adjust window size if needed
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
