// Classe permettant de fabriquer une unité.


public class FactoryMethod {
	// La création d'une unité en fonction de son type est encapsulée dans la fabrique.
	public IThemeFactory getTheme(Option type) {

		IThemeFactory theme = null;
		switch (type) {
			case StarWars:
				theme = new StarWarsThemeFactory();
				break;
			case Mario:
				theme = new MarioThemeFactory();
				break;
			default:
				theme = new StarWarsThemeFactory();
				break;
		}
		return theme;
	}
}

