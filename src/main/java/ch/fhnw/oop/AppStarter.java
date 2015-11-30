
package ch.fhnw.oop;

import ch.fhnw.oop.PM.PresentationModel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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

            TextField höheTextField = new TextField();
            grid.add(höheTextField, 3, 1);

            Label höhe = new Label("Höhe:");
            grid.add(höhe, 2, 1);

            TextField schartenTextField = new TextField();
            grid.add(schartenTextField, 3, 2);

            Label scharten = new Label("Scharten...:");
            grid.add(scharten, 2, 2);

            TextField mbisTextField = new TextField();
            grid.add(mbisTextField, 3, 3);

            Label mbis = new Label("m bis");
            grid.add(mbis, 2, 3);

            TextField regionTextField = new TextField();
            grid.add(regionTextField, 3, 4);

            Label region = new Label("Region:");
            grid.add(region, 2, 4);

            TextField gebietTextField = new TextField();
            grid.add(gebietTextField, 3, 5);

            Label gebiet = new Label("Gebiet:");
            grid.add(gebiet, 2, 5);

                  TextField unterschriftTextField = new TextField();
                  grid.add(unterschriftTextField, 1, 6, 3, 1);

                  Label unterschrift = new Label("Bild Unterschrift:");
                  grid.add(unterschrift, 0, 6);

            /*SplitPane sp = new SplitPane();
            final StackPane sp1 = new StackPane();
            sp1.getChildren().add(unterschrift);
            sp1.getChildren().add(gebiet);
            final StackPane sp2 = new StackPane();
            sp2.getChildren().add(new Button("Button Two"));
            final StackPane sp3 = new StackPane();
            sp3.getChildren().add(new Button("Button Three"));
            sp.getItems().addAll(sp1, sp2, sp3);
            sp.setDividerPositions(0.3f, 0.6f, 0.9f);*/

            SplitPane sp = new SplitPane();
            //sp.getItems().addAll(name, dominanz, km, type, kanton);
            //sp.setDividerPositions(0.3f, 0.6f, 0.9f, 1.2f, 10.0f);
            grid.add(sp, 4, 0, 2, 50);


        Button btn = new Button("Save");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 3, 7);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 9);

            btn.setOnAction(new EventHandler<ActionEvent>() {         //anzeigen der Statusmeldung

                    @Override
                    public void handle(ActionEvent e) {
                            actiontarget.setText("Änderungen gespeichert");
                    }
            });


        Scene scene = new Scene(grid, 1500, 1000);




		String stylesheet = getClass().getResource("style.css").toExternalForm();
		scene.getStylesheets().add(stylesheet);

		//primaryStage.titleProperty().bind(model.applicationTitleProperty());
		primaryStage.setScene(scene);

        scenetitle.setId("title");

        actiontarget.setId("actiontarget");

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
