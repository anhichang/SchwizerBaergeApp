package ch.fhnw.oop;


import ch.fhnw.oop.PM.MountainsPM;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

/**
 * Created by scatman on 12.12.15.
 */
public class MountainsForm extends GridPane implements ViewIt<MountainsPM>{

    private final MountainsPM mountain;
    private GridPane grid;
    private Label     name;
    private TextField nameTextField;
    private Label     dominanz;
    private TextField dominanzTextField;
    private Label     km;
    private TextField kmTextField;
    private Label     type;
    private TextField typeTextField;
    private Label     kanton;
    private TextField kantonTextField;
    private Label     höhe;
    private TextField höheTextField;
    private Label     scharten;
    private TextField schartenTextField;
    private Label     mbis;
    private TextField mbisTextField;
    private Label     region;
    private TextField regionTextField;
    private Label     gebiet;
    private TextField gebietTextField;
    private Label     unterschrift;
    private TextField unterschriftTextField;
    private Button btn;
    private  Text actiontarget;
    private Text scenetitle;


    public MountainsForm(MountainsPM mountain) {
        this.mountain = mountain;
        getStyleClass().add("form");
        init();
    }

    @Override
    public MountainsPM getPresentationModel() {
        return mountain;
    }

    @Override
    public void initializeControls() {
        grid = new GridPane();
        grid.setAlignment(Pos.BOTTOM_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 100, 25, 25));

        scenetitle = new Text("Mountains");

        name = new Label("Name:");
        dominanz = new Label("Dominanz:");
        km = new Label("km bis:");
        type = new Label("Typ:");
        kanton = new Label("Kantone:");
        höhe = new Label("Höhe:");
        scharten = new Label("Scharten...:");
        mbis = new Label("m bis");
        region = new Label("Region:");
        gebiet = new Label("Gebiet:");
        unterschrift = new Label("Bild Unterschrift:");

        nameTextField = new TextField();
        dominanzTextField = new TextField();
        kmTextField = new TextField();
        typeTextField = new TextField();
        kantonTextField = new TextField();
        höheTextField = new TextField();
        schartenTextField = new TextField();
        mbisTextField = new TextField();
        regionTextField = new TextField();
        gebietTextField = new TextField();
        unterschriftTextField = new TextField();

        btn = new Button("Save");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        add(hbBtn, 3, 7);

        actiontarget = new Text();


        btn.setOnAction(new EventHandler<ActionEvent>() {         //anzeigen der Statusmeldung

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setText("Änderungen gespeichert");
            }
        });
    }

    @Override
    public void layoutControls() {
        ColumnConstraints grow = new ColumnConstraints();
        grow.setHgrow(Priority.ALWAYS);
        getColumnConstraints().addAll(new ColumnConstraints(), grow);

        add(scenetitle, 0, 0, 2, 1);
        addRow(1, name, nameTextField, höhe, höheTextField);
        addRow(2, dominanz, dominanzTextField, scharten, schartenTextField);
        addRow(3, km, kmTextField, mbis, mbisTextField);
        addRow(4, type, typeTextField, region, regionTextField);
        addRow(5, kanton, kantonTextField, gebiet, gebietTextField);
        addRow(6, unterschrift, unterschriftTextField);
        add(actiontarget, 1, 9);
    }
    //im Unterricht

    /*@Override
    public void addValueChangedListeners(){
        europe.selectedCountryIdProperty().addListener((observable, oldValue, newValue) -> {
            CountryPM oldSelection = europe.getCountry((int) oldValue);
            CountryPM newSelection = europe.getCountry((int) newValue);

            if(oldSelection != null){
                idField.textProperty().unbind();
                nameField.textProperty().unbindBidirectional(oldSelection.nameProperty());

            }

            if(newSelection != null){
                idField.textProperty().bind(newSelection.idProperty().asString());
                nameField.textProperty().bindBidirectional(newSelection.nameProperty());
            }
        });
    }*/



}
