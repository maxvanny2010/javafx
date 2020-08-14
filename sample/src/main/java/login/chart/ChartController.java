package login.chart;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * ChartController.
 *
 * @author Maxim Vanny
 * @version 5.0
 * @since 8/14/2020
 */
public class ChartController implements Initializable {
    @FXML
    private BarChart<String, Integer> SalaryChart;

    @FXML
    private CategoryAxis y;

    @FXML
    private NumberAxis x;

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {
        final XYChart.Series<String, Integer> chart = new XYChart.Series<>();
        chart.getData().add(new XYChart.Data<>("James", 5000));
        chart.getData().add(new XYChart.Data<>("Tom", 8000));
        chart.getData().add(new XYChart.Data<>("Max", 10000));
        chart.getData().add(new XYChart.Data<>("Katy", 4000));
        chart.getData().add(new XYChart.Data<>("Fox", 1000));
        chart.getData().add(new XYChart.Data<>("Lily", 15000));
        this.SalaryChart.getData().addAll(chart);
    }
}
