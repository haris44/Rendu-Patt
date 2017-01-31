import javafx.scene.control.Button;

/**
 * Created by Alex on 11/01/2017.
 */
public class ButtonUpperCaseDecorator implements IButton {

	private IButton _button;

	public ButtonUpperCaseDecorator(IButton button){
		this._button = button;
	}

	@Override
	public Button createButton() {
		Button but = this._button.createButton();
		but.setText(but.getText().toUpperCase());
		return but;
	}

}
