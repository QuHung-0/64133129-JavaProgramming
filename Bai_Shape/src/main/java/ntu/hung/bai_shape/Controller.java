package ntu.hung.bai_shape;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Canvas canvas;

    public void initialize() {
        drawShape();
    }

    private void drawShape() {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.BLACK);
        double[] xPoints = {150, 50, 250};
        double[] yPoints = {50, 200, 200};
        gc.strokePolygon(xPoints, yPoints, 3);

        gc.setStroke(Color.RED);
        double[] xInnerPoints = {150, 130, 170};
        double[] yInnerPoints = {120, 160, 160};
        gc.strokePolygon(xInnerPoints, yInnerPoints, 3);

        


        gc.strokeOval(100, 200, 100, 100);


        gc.strokeOval(110, 280, 30, 30);
        gc.strokeOval(160, 280, 30, 30);

        gc.setFill(Color.RED);
        gc.fillOval(120, 290, 10, 10);
        gc.fillOval(170, 290, 10, 10);
    }
}
