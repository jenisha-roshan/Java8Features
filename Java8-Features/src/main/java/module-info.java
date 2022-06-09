module com.example.java8features {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java8features to javafx.fxml;
    exports com.example.java8features;
}