package login.pie;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * ChartController.
 *
 * @author Maxim Vanny
 * @version 5.0
 * @since 8/14/2020
 */
public class PieChartController implements Initializable {

    @FXML
    private Pane paneView;

    private void loadData() {
        this.paneView.getChildren().clear();
        final ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
        list.add(new PieChart.Data("Java", 40));
        list.add(new PieChart.Data("C", 20));
        list.add(new PieChart.Data("C#", 25));
        list.add(new PieChart.Data("JavaFX", 15));
        PieChart chart = new PieChart(list);
        chart.setTitle("Lang in world");
        this.paneView.getChildren().add(chart);
    }

    @Override
    public void initialize(final URL location, final ResourceBundle resources) {
        this.loadData();
    }
}
