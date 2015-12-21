package ch.fhnw.oop;

import ch.fhnw.oop.PM.Mountains;
import ch.fhnw.oop.PM.MountainsPM;
import javafx.scene.control.TableView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * Created by scatman on 21.12.15.
 */
public class MountainsTableView extends VBox{

        private final MountainsPM model;

        private TableView<Mountains> tabelle;

        public MountainsTableView(MountainsPM model) {
            this.model = model;
            initializeControls();
            layoutControls();
            addEventHandlers();
            addValueChangedListeners();
            addBindings();
        }

        public void initializeControls() {
            tabelle = initializeResultatTabelle();
        }

        private TableView<Mountains> initializeResultatTabelle() {
            TableView<Mountains> tableView = new TableView<>(model.getResultate());


            return tableView;
        }

        public void layoutControls() {
            setVgrow(tabelle, Priority.ALWAYS);

            getChildren().addAll(tabelle);
        }

        private void addEventHandlers() {
        }

        private void addValueChangedListeners() {
        }

        public void addBindings() {
        }



}
