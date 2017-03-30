package model.repositories;

import java.util.LinkedList;
import java.util.List;

import model.Materia;

public class MateriasRepository {

	private List<Materia> materias = new LinkedList<>();

	public void agregar(Materia materia) {
		this.materias.add(materia);
	}

	public List<Materia> all() {
		return materias;
	}

}
