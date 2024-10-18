module com.example.javafx_tic_tac_toe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx_tic_tac_toe to javafx.fxml;
    exports com.example.javafx_tic_tac_toe;
}