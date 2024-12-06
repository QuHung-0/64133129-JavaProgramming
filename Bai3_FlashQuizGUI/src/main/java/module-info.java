module ntu.hung.bai3_flashquizgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ntu.hung.bai3_flashquizgui to javafx.fxml;
    exports ntu.hung.bai3_flashquizgui;
}