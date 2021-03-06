import javafx.scene.control.Button;

/**
 * Created by Alex on 04/01/2017.
 */
public class MarioThemeFactory extends Button implements IThemeFactory{


	public Button getButton() {
		return new ButtonSizeDecorator(new ButtonAlertDecorator(new ButtonMario())).createButton();
	}

	public String getName() {
		return "Mario";
	}

}
