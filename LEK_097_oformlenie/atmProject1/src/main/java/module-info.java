module com.example.atmproject1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atmproject1 to javafx.fxml;
    exports com.example.atmproject1;
}