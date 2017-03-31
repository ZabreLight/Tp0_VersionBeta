package ui.windows;

import org.eclipse.swt.SWT;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Materia;
import ui.vm.AlgoViewModel;



public class ValidarTokenWindow extends SimpleWindow<AlgoViewModel> {

	public ValidarTokenWindow(WindowOwner parent) {
		super(parent, new AlgoViewModel());
	}

	@Override // Despues del override van todas las cosas que queres modificar de la clase que heredes, en este Caso SimpleWindow
	protected void addActions(Panel panelActions) {
		new Button(panelActions)
		.setCaption("Validar")
		.onClick(this::listadoMaterias);
	}

	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Alumnos");
		
	
		
	/*	TextBox nuestroTextBox  = (TextBox) new TextBox(formPanel)
			.setWidth(250)
			.bindValueToProperty("token");
	*/
		
	new NumericField(formPanel).bindValueToProperty("token");
		
	} 

	public void listadoMaterias() {
		Dialog<?> dialog = new ListadoMateriasWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}

	
}
