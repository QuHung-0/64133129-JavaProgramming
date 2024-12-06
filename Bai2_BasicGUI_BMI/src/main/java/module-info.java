module ntu.hung.bai2_basicgui_bmi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens ntu.hung.bai2_basicgui_bmi to javafx.fxml;
    exports ntu.hung.bai2_basicgui_bmi;
}