import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

/**
 * Created by Alex on 31/01/2017.
 */
public class ButtonSizeDecorator implements IButton {

	private IButton _button;

	public ButtonSizeDecorator(IButton button){
		this._button = button;
	}

	@Override
	public Button createButton() {
		Button but = this._button.createButton();
		but.setOpacity(0.5);
		return but;
	}
}

