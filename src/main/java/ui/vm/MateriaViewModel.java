package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Materia;
import model.repositories.Repositorios;

@Observable
public class MateriaViewModel {

	private List<Materia> materias;
	private Materia materiaSeleccionada;

	public MateriaViewModel() {
		this.materias = Repositorios.materias.all();
	}

	public Materia getMateriaSeleccionada() {
		return materiaSeleccionada;
	}

	public void setPrendaSeleccionada(Materia materiaSeleccionada) {
		this.materiaSeleccionada = materiaSeleccionada;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

}
