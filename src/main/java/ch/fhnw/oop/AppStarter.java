
package ch.fhnw.oop;

import ch.fhnw.oop.PM.PresentationModel;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppStarter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		PresentationModel model = new PresentationModel();

		//Parent rootPanel = new ApplicationUI(model);

		/*Scene scene = new Scene(rootPanel);

    	String stylesheet = getClass().getResource("style.css").toExternalForm();
		scene.getStylesheets().add(stylesheet);

		primaryStage.titleProperty().bind(model.applicationTitleProperty());
		primaryStage.setScene(scene);*/

        primaryStage.setTitle("Schwitzer Bärge App");

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Alphubel");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label name = new Label("Name:");
        grid.add(name, 0, 1);

        TextField nameTextField = new TextField();
        grid.add(nameTextField, 1, 1);

        Label dominanz = new Label("Dominanz:");
        grid.add(dominanz, 0, 2);

        TextField dominanzTextField = new TextField();
        grid.add(dominanzTextField, 1, 2);

        Label km = new Label("km bis:");
        grid.add(km, 0, 3);

        TextField kmTextField = new TextField();
        grid.add(kmTextField, 1, 3);

        Label type = new Label("Typ:");
        grid.add(type, 0, 4);

        TextField typeTextField = new TextField();
        grid.add(typeTextField, 1, 4);

        Label kanton = new Label("Kantone:");
        grid.add(kanton, 0, 5);

        TextField kantonTextField = new TextField();
        grid.add(kantonTextField, 1, 5);


        Scene scene = new Scene(grid, 1500, 1000);

        Button btn = new Button("Save");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 6);


		String stylesheet = getClass().getResource("style.css").toExternalForm();
		scene.getStylesheets().add(stylesheet);

		//primaryStage.titleProperty().bind(model.applicationTitleProperty());
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
