package ntu.hung.bai_shape;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setTitle("Shape Drawing App");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}