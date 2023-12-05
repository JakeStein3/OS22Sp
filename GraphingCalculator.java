package Oswego;
/*
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GraphingCalculator extends Application {

    private TextField equationInput;
    private LineChart<Number, Number> chart;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Graphing Calculator");

        // Create input controls
        Label equationLabel = new Label("Equation:");
        equationInput = new TextField();
        Button graphButton = new Button("Graph");

        // Create chart
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Graph");

        // Create layout and add controls
        GridPane layout = new GridPane();
        layout.add(equationLabel, 0, 0);
        layout.add(equationInput, 1, 0);
        layout.add(graphButton, 2, 0);
        layout.add(chart, 0, 1, 3, 1);

        // Add event handler for graph button
        graphButton.setOnAction(event -> {
            String equation = equationInput.getText();
            graphEquation(equation);
        });

        // Show the window
        primaryStage.setScene(new Scene(layout, 600, 400));
        primaryStage.show();
    }

    private void graphEquation(String equation) {
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName(equation);
        for (double x = -10; x <= 10; x += 0.1) {
            double y = evaluateEquation(equation, x);
            series.getData().add(new XYChart.Data<>(x, y));
        }
        chart.getData().add(series);
    }

    private double evaluateEquation(String equation, double x) {
        // This is where you would implement code to parse and evaluate the equation
        // For simplicity, we will just use a linear equation y = mx + b
        double m = 2.0;
        double b = 3.0;
        return m * x + b;
    }

}

 */
