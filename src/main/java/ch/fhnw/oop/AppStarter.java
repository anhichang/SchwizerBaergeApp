
package ch.fhnw.oop;

import ch.fhnw.oop.PM.PresentationModel;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppStarter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		PresentationModel model = new PresentationModel();

		Parent rootPanel = new ApplicationUI(model);

		/*Scene scene = new Scene(rootPanel);

		primaryStage.titleProperty().bind(model.applicationTitleProperty());
		primaryStage.setScene(scene);*/

        primaryStage.setTitle("Schwitzer Bärge App");





		GridPane grid = new GridPane();
		grid.setAlignment(Pos.BOTTOM_CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 100, 25, 25));

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

       /* GridPane grid1 = new GridPane();                    //Test 2 GridPanes nebeneinander Positionieren
        grid1.setAlignment(Pos.BOTTOM_LEFT);
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.setPadding(new Insets(25, 25, 25, 25));

        grid1.add(scenetitle, 0, 0, 2, 1);
        grid1.add(regionTextField, 3, 4);
        grid1.add(region, 2, 4);
        grid1.add(gebietTextField, 3, 5);
        grid1.add(gebiet, 2, 5);                            //end*/

       // ListView<?> list = new ListView<>();


        SplitPane sp = new SplitPane();
            final StackPane sp1 = new StackPane();
           /* sp1.getChildren().add(scenetitle);
            sp1.getChildren().add(name);
            sp1.getChildren().add(nameTextField);
            sp1.getChildren().add(dominanz);
            sp1.getChildren().add(dominanzTextField);
            sp1.getChildren().add(km);
            sp1.getChildren().add(kmTextField);
            sp1.getChildren().add(type);
            sp1.getChildren().add(typeTextField);
            sp1.getChildren().add(kanton);
            sp1.getChildren().add(kantonTextField);
            sp1.getChildren().add(höhe);
            sp1.getChildren().add(höheTextField);
            sp1.getChildren().add(scharten);
            sp1.getChildren().add(schartenTextField);
            sp1.getChildren().add(mbis);
            sp1.getChildren().add(mbisTextField);
            sp1.getChildren().add(region);
            sp1.getChildren().add(regionTextField);
            sp1.getChildren().add(gebiet);
            sp1.getChildren().add(gebietTextField);
            sp1.getChildren().add(unterschrift);
            sp1.getChildren().add(unterschriftTextField);*/
            final StackPane sp2 = new StackPane();
            sp2.getChildren().add(grid);
            sp.getItems().addAll(sp1, sp2);
            sp.setDividerPositions(0.3f, 0.6f, 0.9f);

           //SplitPane sp = new SplitPane();
           //sp.getItems().addAll(name, dominanz, km, type, kanton);
           //sp.setDividerPositions(0.3f, 0.6f, 0.9f, 1.2f, 10.0f);
           //grid.add(sp, 4, 0, 2, 10);


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

        BorderPane rootPane = new BorderPane();
        rootPane.setRight(grid);
        //rootPane.setLeft(grid1);


        Scene scene = new Scene(rootPane, 1500, 1000);




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
