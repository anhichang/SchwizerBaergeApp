/*package ch.fhnw.oop;

import ch.fhnw.oop.PM.MountainsPM;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

/**
 * Created by scatman on 21.12.15.
 */
/*    public class MountainList extends ListView implements ViewIt<MountainsPM> {

    private final MountainsPM mountain;
    private ListView listView;
    private Label name;
    private Label höhe;
    private Label gebiet;



    public MountainList(MountainsPM mountain) {
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
        listView = new ListView();


        name = new Label(mountain.);
        höhe = new Label("Höhe:");
        gebiet = new Label("Gebiet:");

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

 //}
