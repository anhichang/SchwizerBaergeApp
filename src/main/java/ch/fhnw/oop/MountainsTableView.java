package ch.fhnw.oop;

import ch.fhnw.oop.PM.Mountains;
import ch.fhnw.oop.PM.MountainsPM;
import javafx.beans.binding.Bindings;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * Created by scatman on 21.12.15.
 */
public class MountainsTableView extends TableView {


    private final MountainsPM model;

    private TableView<Mountains> tabelle;
    private Label anzahlBerge;


    public MountainsTableView(MountainsPM model) {
        this.model = model;
        initializeControls();
        layoutControls();
        addEventHandlers();
        addValueChangedListeners();
        addBindings();
        select();
    }

    public void initializeControls() {
        tabelle = initializeResultatTabelle();
        anzahlBerge = new Label();
    }

    private TableView<Mountains> initializeResultatTabelle() {
        TableView<Mountains> tableView = new TableView<>(model.getResultate());

        TableColumn<Mountains, String> bergId         = new TableColumn<>("Id");
        TableColumn<Mountains, String> bergCol          = new TableColumn<>("");
        TableColumn<Mountains, String> bergKanton     = new TableColumn<>("Kanton");
        TableColumn<Mountains, Number> bergHöhe       = new TableColumn<>("Höhe");
        TableColumn<Mountains, String> bergHöhe2      = new TableColumn<>("Höhe2");

        bergId.setCellValueFactory(cell -> cell.getValue().bergNrProperty());
        bergCol.setCellValueFactory(cell -> cell.getValue().bergKantoneProperty());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        bergKanton.setCellValueFactory(cell -> cell.getValue().bergNameProperty());
        bergHöhe.setCellValueFactory(cell -> cell.getValue().bergHoeheProperty());
        bergHöhe2.setCellValueFactory(cell -> cell.getValue().bergHoeheProperty().asString("%.2f %%"));

        bergHöhe2.setComparator((o1, o2) -> Float.valueOf(o1.substring(0, o1.length() - 2))
                .compareTo(Float.valueOf(o2.substring(0, o2.length() - 2))));

        bergCol.setCellFactory(param -> new MountainsTableCell());

        bergId.setMinWidth(200);

        tableView.getColumns().addAll(bergId, bergCol, bergKanton, bergHöhe, bergHöhe2);//Variable übergeben von Kanton

        return tableView;
    }

    public void layoutControls() {
        setVgrow(tabelle, Priority.ALWAYS);

        getChildren().addAll(tabelle, anzahlBerge);
    }


    private void addEventHandlers() {
    }

    private void addValueChangedListeners() {

    }

    public void addBindings() {
        anzahlBerge.textProperty()
                .bind(Bindings.size(model.getResultate()).asString("Berg %d Region"));
        //tabelle.selectionModelProperty().bindBidirectional(model.selectedMountainIdProperty());
        //Bindings.bindBidirectional(inputField.textProperty(),model.selectedMountainIdProperty(), new NumberStringConverter());

    }

    public void select(){
        getSelectionModel().selectedItemProperty().addListener(
                (observable, oldSelection, newSelection) -> model.setSelectedMountain(newSelection));

        getSelectionModel().selectedItemProperty().addListener(
                (observable, oldSelection, newSelection) -> {
                    try {
                        model.setSelectedMountain(newSelection.getBergId());
                    } catch (NullPointerException e) {

                    }
                });

    }


}
