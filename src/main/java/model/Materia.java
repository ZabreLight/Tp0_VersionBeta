package model;

import org.uqbar.commons.utils.Observable;

@Observable
public class Materia {
	private String asignatura;
	private int nota;
	private String aprobado;

	public Materia(String asignatura, int nota, String aprobado) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
		this.aprobado = aprobado;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public int getNota() {
		return nota;
	}

	public String getAprobado() {
		return aprobado;
	}

}
