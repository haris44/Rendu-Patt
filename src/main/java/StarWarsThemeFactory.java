import javafx.scene.control.Button;

/**
 * Created by Alex on 04/01/2017.
 */
public class StarWarsThemeFactory implements IThemeFactory {

	public Button getButton() {
		return new ButtonUpperCaseDecorator(new ButtonStarWars()).createButton();
	}

	public String getName() {
		return "StarWars";
	}
}
