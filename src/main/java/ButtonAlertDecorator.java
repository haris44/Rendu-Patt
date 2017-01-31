import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * Created by Alex on 31/01/2017.
 */
public class ButtonAlertDecorator implements IButton {

	private IButton _button;

	public ButtonAlertDecorator(IButton button){
		this._button = button;
	}

	@Override
	public Button createButton() {
		Button but = this._button.createButton();
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Information Dialog");
		alert.setHeaderText(null);
		alert.setContentText("I have a great message for you!");
		but.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				alert.showAndWait();
			}
		});
		return but;
	}
}
