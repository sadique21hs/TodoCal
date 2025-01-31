module com.example.TodoCal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.TodoCal to javafx.fxml;
    exports com.example.TodoCal;
}