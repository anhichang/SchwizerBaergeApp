
package ch.fhnw.oop;

import ch.fhnw.oop.PM.MountainsPM;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppStarter extends Application {

	/*@Override
	public void start(Stage primaryStage) throws Exception {

		MountainsPM model = new MountainsPM();
		MountainsForm form = new MountainsForm(model);

		//Parent rootPanel = new ApplicationUI(model);

		Scene scene = new Scene(form);

		primaryStage.titleProperty().bind(model.applicationTitleProperty());
		primaryStage.setScene(scene);

        String stylesheet = getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(stylesheet);

        primaryStage.setResizable(true);

        primaryStage.show();
    }*/																									// änderungen für Test SelectionBar #8

	public void start(Stage primaryStage) throws Exception {
		MountainsPM model = new MountainsPM();

		Parent rootPanel = new ApplicationUI(model);

		Scene scene = new Scene(rootPanel);

		String stylesheet = getClass().getResource("style.css").toExternalForm();
		scene.getStylesheets().add(stylesheet);

		primaryStage.titleProperty().bind(model.applicationTitleProperty());
		primaryStage.setScene(scene);

		primaryStage.setResizable(false);

		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
