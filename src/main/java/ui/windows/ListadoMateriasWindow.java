package ui.windows;


import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import model.Materia;
import ui.vm.MateriaViewModel;

public class ListadoMateriasWindow extends Dialog<MateriaViewModel> {

	public ListadoMateriasWindow(WindowOwner owner) {
		super(owner, new MateriaViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Materia");
		Selector<Materia> selectorMateria = new Selector<Materia>(form).allowNull(true);
		selectorMateria.bindItemsToProperty("materias");
		selectorMateria.bindValueToProperty("materiaSeleccionada");
		
		new Label(form).setText("Aprobo");
		new Label(form).setText("si");
		
		new Label(form).setText("Ultima Nota");
		new Label(form).bindValueToProperty("materiaSeleccionada.nombre");
	}

	@Override
	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
		new Button(actions).setCaption("Cancelar").onClick(this::cancel);
	}

	@Override
	protected void executeTask() {
		System.out.println("Me aceptaron, yuppiiii!!!");
		super.executeTask();
	}

}
