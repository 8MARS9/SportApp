module com.example.petsimulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.petsimulator to javafx.fxml;
    exports com.example.petsimulator;
}