import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Test extends Application {

	public Button but;

	public static void main(String[] args) {
		Application.launch(Test.class, args);
	}

	@Override
	public void start(final Stage primaryStage) {
		primaryStage.setTitle("Hello World");
		final Group root = new Group();
		Scene scene = new Scene(root, 300, 250, Color.LIGHTGREEN);

		but = new MarioThemeFactory().getButton();

		ObservableList<Option> options =
				FXCollections.observableArrayList(
						Option.StarWars,
						Option.Mario
				);

		final ComboBox comboBox = new ComboBox(options);
		comboBox.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				root.getChildren().remove(but);
				if(comboBox.getValue() == Option.Mario){
					but = new MarioThemeFactory().getButton();
				} else {
					but = new StarWarsThemeFactory().getButton();
				}
				root.getChildren().add(but);
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