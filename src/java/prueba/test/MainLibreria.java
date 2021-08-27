package prueba.test;

import java.util.Date;

public class MainLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargaBase carga = new CargaBase();
		carga.llenarBase();

		Libro libro1 = new Libro("A10", "", "", new Date(), new Autor());

		BaseDeDatos.insertarLibro(libro1);

		Libro libro = BaseDeDatos.buscarLibroPorCodigo("A11");
		System.out.println(libro);
		//Nombre
	}

}
