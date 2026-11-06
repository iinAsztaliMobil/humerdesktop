module com.example {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires hu.szit.resclient;

    opens com.example to javafx.fxml, com.google.gson;
    exports com.example;
}
