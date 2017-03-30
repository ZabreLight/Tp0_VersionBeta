package model;

import model.repositories.Repositorios;

public class Fixture {

	public static void initialize() {
		Materia analisisMatematico = new Materia("Analisis Mtematico", 2, "No");
		Materia ingenieriaYSociedad = new Materia("Ingenieria y Sociedad", 8, "Si");
		
		Repositorios.materias.agregar(analisisMatematico);
		Repositorios.materias.agregar(ingenieriaYSociedad);
	}

}
