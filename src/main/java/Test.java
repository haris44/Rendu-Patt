import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.ObjPtr;

public class Test extends Application {

	public Button but;

	public static void main(String[] args) {
		Application.launch(Test.class, args);
	}

	@Override
	public void start(final Stage primaryStage) {
		primaryStage.setTitle("Hello World");
		final Group root = new Group();
		Scene scene = new Scene(root, 300, 250, Color.BEIGE);

		but = new MarioThemeFactory().getButton();

		ObservableList<IThemeFactory> options =
				FXCollections.observableArrayList(
						new MarioThemeFactory(),
						new StarWarsThemeFactory()
				);

		final ComboBox comboBox = new ComboBox(options);
		comboBox.getSelectionModel().selectFirst();
		comboBox.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				root.getChildren().remove(but);
				IThemeFactory selectedButton = (IThemeFactory) comboBox.getValue();
				but = selectedButton.getButton();
				root.getChildren().add(but);
			}
		});


		comboBox.setCellFactory(new Callback<ListView<IThemeFactory>,ListCell<IThemeFactory>>(){
			@Override
			public ListCell<IThemeFactory> call(ListView<IThemeFactory> p) {
				final ListCell<IThemeFactory> cell = new ListCell<IThemeFactory>(){
					@Override
					protected void updateItem(IThemeFactory item, boolean empty) {
						super.updateItem(item, empty);
						if (item == null || empty) {
							setGraphic(null);
						} else {
							setAccessibleText(item.getName());
							setText(item.getName());
						}
					}
				};
				return cell;
			}
		});




		comboBox.setLayoutX(200);
		comboBox.setLayoutY(100);

		root.getChildren().add(but);
		root.getChildren().add(comboBox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}