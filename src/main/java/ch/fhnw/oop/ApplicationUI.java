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
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane implements ViewIt<MountainsPM> {
    private final MountainsPM model;

    private MountainsForm mountainsForm;
    private MountainsTableView listView;
    private SelectorBar   toolbar;
    private MountainsHeader header;                             //new
    private SplitPane sp;

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
        listView = new MountainsTableView(model);
        listView.setMinWidth(180);
        listView.setMaxWidth(340);
        toolbar     = new SelectorBar(model);
        header = new MountainsHeader(model);            //new
        sp = new SplitPane(listView, mountainsForm);
        sp.setDividerPositions(0.35f, 0.65f);
    }

    @Override
    public void layoutControls() {
        setTop(header);
        setBottom(toolbar);
        setCenter(sp);
    }

}
