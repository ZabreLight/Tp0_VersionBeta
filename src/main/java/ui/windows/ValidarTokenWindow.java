package ui.windows;

import org.eclipse.swt.SWT;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Venta;
import ui.vm.AlgoViewModel;

public class ValidarTokenWindow extends SimpleWindow<AlgoViewModel> {
	private Text ingresarToken;

	public ValidarTokenWindow(WindowOwner parent) {
		super(parent, new AlgoViewModel());
	}

	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions)
		.setCaption("Validar")
		.onClick(this::listadoMaterias);
	}

	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Macowins - Ventas");
		
		 new TextBox(form);
			.setWidth(250);
			.bindValueToProperty("token");
	
	}

	public void listadoMaterias() {
		Dialog<?> dialog = new ListadoMateriasWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}

	
}
