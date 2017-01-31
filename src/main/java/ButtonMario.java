import javafx.scene.control.Button;

/**
 * Created by Alex on 04/01/2017.
 */
public class ButtonMario  extends Button implements IButton {
	public Button createButton() {
		Button but = new Button("MarioThemeFactory");
		but.setStyle("-fx-base: #620000;");
		return but;
	}
}
