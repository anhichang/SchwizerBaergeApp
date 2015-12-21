package ch.fhnw.oop;

/**
 * Created by scatman on 12.12.15.
 */
public interface ViewIt<T> {

    T getPresentationModel();

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

    default void addValueChangedListeners() {
    }

    default void addBindings() {
    }
}

