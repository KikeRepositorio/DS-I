module com.example.tercero {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tercero to javafx.fxml;
    exports com.example.tercero;
}