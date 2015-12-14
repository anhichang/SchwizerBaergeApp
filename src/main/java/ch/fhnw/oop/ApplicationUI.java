package ch.fhnw.oop;

/*public class ApplicationUI extends StackPane {
	private final MountainsPM model;
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

	public MountainsPM getPresentationsModel() {
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
*/

                      // #5

import ch.fhnw.oop.PM.MountainsPM;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane implements ViewIt<MountainsPM> {
    private final MountainsPM model;

    private MountainsForm mountainsForm;
    private SelectorBar   toolbar;

    public ApplicationUI(MountainsPM model) {
        this.model = model;
        init();
    }

    @Override
    public MountainsPM getPresentationModel() {
        return model;
    }

    @Override
    public void initializeControls() {
        mountainsForm = new MountainsForm(model);
        toolbar     = new SelectorBar(model);
    }

    @Override
    public void layoutControls() {
        setTop(toolbar);
        setCenter(mountainsForm);
    }

}
