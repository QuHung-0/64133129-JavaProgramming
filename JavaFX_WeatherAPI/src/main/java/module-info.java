module com.example.javafx_weatherapi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires json.simple;

    opens com.example.javafx_weatherapi to javafx.fxml;
    exports com.example.javafx_weatherapi;
}