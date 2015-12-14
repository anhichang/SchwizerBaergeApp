package ch.fhnw.oop;

import ch.fhnw.oop.PM.MountainsPM;
import javafx.beans.binding.Bindings;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.util.converter.NumberStringConverter;

/**
 * Created by scatman on 14.12.15.
 */
public class SelectorBar extends HBox implements ViewIt<MountainsPM> {

    private final MountainsPM mountain;

    private Slider slider;
    private TextField inputField;

    public SelectorBar(MountainsPM mountain) {
        super();
        this.mountain = mountain;
        getStyleClass().add("selectorbar");
        init();
    }

    @Override
    public MountainsPM getPresentationModel() {
        return mountain;
    }

    @Override
    public void initializeControls() {
        slider = new Slider();
        slider.setMin(0.0);
        slider.setMax(mountain.getAllMountains().size() - 1);
        inputField = new TextField();
    }

    @Override
    public void layoutControls() {
        getChildren().addAll(slider, inputField);
    }

    @Override
    public void addBindings() {
        slider.valueProperty().bindBidirectional(mountain.selectedMountainIdProperty());

        Bindings.bindBidirectional(inputField.textProperty(),mountain.selectedMountainIdProperty(), new NumberStringConverter());
        //inputField.textProperty().bindBidirectional(europe.selectedCountryIdProperty());
    }
}
