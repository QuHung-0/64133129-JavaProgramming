package ntu.hung.bai_shape;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller
{

    @FXML
    private Canvas canvas;

    public void initialize()
    {
        drawShape();
    }

    private void drawShape()
    {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //Hinh Tron
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.strokeOval(100, 180, 100, 100);

        //Tam giac To
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);
        double[] xPoints = {150, 50, 250};
        double[] yPoints = {50, 200, 200};
        gc.fillPolygon(xPoints, yPoints, 3);
        gc.strokePolygon(xPoints, yPoints, 3);

        gc.setStroke(Color.RED);
        double[] xInnerPoints = {150, 130, 170};
        double[] yInnerPoints = {160, 120, 120};
        gc.strokePolygon(xInnerPoints, yInnerPoints, 3);


        gc.setStroke(Color.BLACK);
        double[] xHorn1 = {115, 115, 130};
        double[] yHorn1 = {100, 50, 75};
        double[] xHorn2 = {185, 185, 170};
        double[] yHorn2 = {100, 50, 75};
        gc.strokePolygon(xHorn1, yHorn1, 3);
        gc.strokePolygon(xHorn2, yHorn2, 3);


        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);



        gc.fillOval(110, 260, 30, 30);
        gc.strokeOval(110, 260, 30, 30);

        gc.fillOval(160, 260, 30, 30);
        gc.strokeOval(160, 260, 30, 30);

        gc.setFill(Color.RED);
        gc.fillOval(120, 270, 10, 10);
        gc.fillOval(170, 270, 10, 10);
    }
}
