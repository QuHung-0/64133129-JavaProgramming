module ntu.hung.bai1_basicgui_simplemath {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ntu.hung.bai1_basicgui_simplemath to javafx.fxml;
    exports ntu.hung.bai1_basicgui_simplemath;
}