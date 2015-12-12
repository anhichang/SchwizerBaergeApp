package ch.fhnw.oop;

import ch.fhnw.oop.PM.MountainsPM;

/**
 * Created by scatman on 12.12.15.
 */
public interface ViewIt {

    MountainsPM getPresentationModel();

    default void init() {
        initializeControls();
        layoutControls();
        addEventHandlers();
        addValueChangedListeners();
        addBindings();
    }

    void initializeControls();

    void layoutControls();

    default void addEventHandlers() {
    }

    /*default void addValueChangedListeners() {
    }*/

    default void addBindings() {
    }
}

