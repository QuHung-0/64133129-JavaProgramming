module ntu.hung.bai5_simpledict {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens ntu.hung.bai5_simpledict to javafx.fxml;
    exports ntu.hung.bai5_simpledict;
}