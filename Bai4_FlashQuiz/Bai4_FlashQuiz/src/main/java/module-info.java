module ntu.hung.bai4_flashquiz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ntu.hung.bai4_flashquiz to javafx.fxml;
    exports ntu.hung.bai4_flashquiz;
}