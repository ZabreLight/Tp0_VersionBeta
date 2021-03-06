import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import model.Fixture;
import ui.windows.ValidarTokenWindow;

public class VentasApplication extends Application{

	public static void main(String[] args) {
		Fixture.initialize();
		new VentasApplication().start();
	}
	
	@Override
	protected Window<?> createMainWindow() {
		return new ValidarTokenWindow(this);
	}
}
