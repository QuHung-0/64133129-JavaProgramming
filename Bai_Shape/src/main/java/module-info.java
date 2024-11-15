module ntu.hung.bai_shape {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens ntu.hung.bai_shape to javafx.fxml;
    exports ntu.hung.bai_shape;
}