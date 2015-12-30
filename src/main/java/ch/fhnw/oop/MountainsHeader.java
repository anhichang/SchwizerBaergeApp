package ch.fhnw.oop;

import ch.fhnw.oop.PM.MountainsPM;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by scatman on 21.12.15.
 */
public class MountainsHeader extends VBox implements ViewIt<MountainsPM> {



        private final MountainsPM mountainsPM;

         private Button save;
         private Button add;
         private Button undo;
         private Button redo;
         private Button delete;
         private TextField search;
         private HBox hbBtn;



        public MountainsHeader(MountainsPM mountainsPM) {
            this.mountainsPM = mountainsPM;
            getStyleClass().add("header");
            init();
        }

        @Override
        public MountainsPM getPresentationModel() {
            return mountainsPM;
        }

        @Override
        public void initializeControls() {

            hbBtn = new HBox(10);
            save = new Button("Save");
            add = new Button("add");
            undo = new Button("undo");
            redo = new Button("redo");
            delete = new Button("delete");

            hbBtn.setAlignment(Pos.CENTER_LEFT);
            hbBtn.getChildren().add(save);
            hbBtn.getChildren().add(add);
            hbBtn.getChildren().add(undo);
            hbBtn.getChildren().add(redo);
            hbBtn.getChildren().add(delete);


            search = new TextField("search");
            search.setAlignment(Pos.CENTER_RIGHT);
            hbBtn.getChildren().add(search);

        }

        @Override
        public void layoutControls() {
            getChildren().addAll(hbBtn);
            save.setMinSize(148, 148); save.setMaxSize(148, 148);
        }

       /* @Override
        public void addValueChangedListeners(){
            mountainsPM.selectedMountainIdProperty().addListener((observable, oldValue, newValue) -> {
                Mountains oldSelection = mountainsPM.getBergId((int) oldValue);
                Mountains newSelection = mountainsPM.getBergId((int) newValue);

                if(oldSelection != null){
                    nameLabel.textProperty().unbind();
                    areaLabel.textProperty().unbindBidirectional(oldSelection.bergNameProperty());

                }

                if(newSelection != null){
                    nameLabel.textProperty().bind(newSelection.bergNrProperty());
                    areaLabel.textProperty().bindBidirectional(newSelection.bergNameProperty());
                }
            });
        }*/



}
