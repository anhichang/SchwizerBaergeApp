package ch.fhnw.oop;

import ch.fhnw.oop.PM.MountainsPM;
import ch.fhnw.oop.PM.PresentationModel;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class ApplicationUI extends StackPane {
	private final MountainsPMgi model;
	private MountainsForm mountainsForm;
	private Button button;

	public ApplicationUI(MountainsPM model) {
		this.model = model;
		initializeControls();
		layoutControls();
		addEventHandlers();
		addValueChangedListeners();
		addBindings();
	}

	public MountainsPM getPresentations Model() {
		return model;
	}
	private void initializeControls() {
		mountainsForm = new MountainsForm(model);
		button = new Button();
	}

	private void layoutControls() {
		getChildren().add(button);
	}

	private void addEventHandlers() {
	}

	private void addValueChangedListeners() {
	}

	private void addBindings() {
		button.textProperty().bind(model.greetingProperty());
	}
}
