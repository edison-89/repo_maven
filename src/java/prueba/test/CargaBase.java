package prueba.test;

import java.util.Date;

public class CargaBase {

	public void llenarBase() {
		Autor autor = new Autor();
		autor.setNombre("Edison");

		Libro libro1 = new Libro("A1", "", "", new Date(), autor);
		Libro libro2 = new Libro("A2", "", "", new Date(), autor);
		Libro libro3 = new Libro("A3", "", "", new Date(), autor);
		Libro libro4 = new Libro("A4", "", "", new Date(), autor);
		Libro libro5 = new Libro("A5", "", "", new Date(), autor);
		
		BaseDeDatos.insertarLibro(libro1);
		BaseDeDatos.insertarLibro(libro2);
		BaseDeDatos.insertarLibro(libro3);
		BaseDeDatos.insertarLibro(libro4);
		BaseDeDatos.insertarLibro(libro5);
	}
}
