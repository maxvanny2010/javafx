package login.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Lunch.
 *
 * @author Maxim Vanny
 * @version 5.0
 * @since 8/14/2020
 */
public class Lunch extends Application {
    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setOpacity(0);
        primaryStage.show();

        final Stage secondaryStage = new Stage();
        secondaryStage.initStyle(StageStyle.UTILITY);
        secondaryStage.initOwner(primaryStage);

        final Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        final Scene scene = new Scene(root);
        secondaryStage.setScene(scene);
        secondaryStage.show();
    }
}
