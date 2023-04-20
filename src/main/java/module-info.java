module com.example.dynamiccontrolsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dynamiccontrolsfx to javafx.fxml;
    exports com.example.dynamiccontrolsfx;
}