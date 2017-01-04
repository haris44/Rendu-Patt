import javafx.scene.control.Button;

/**
 * Created by Alex on 04/01/2017.
 */
public class ButtonStarWars extends Button implements IButton {
	public Button createButton() {
		Button but =  new Button("StarWarsThemeFactory");
		but.setStyle("-fx-base: #070062;");
		return but;
	}
}
