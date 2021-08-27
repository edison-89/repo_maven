package prueba.test;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {

	private static int lugarDisponible = 0;

	private static Libro[] tablaLibros = new Libro[100];

	public static void insertarLibro(Libro libro) {
		tablaLibros[lugarDisponible] = libro;
		lugarDisponible++;
	}

	public static void actualizarLibro(Libro libro) {
		int posicionLibro = buscarPosiciónLibro(libro.getCodigo());
		tablaLibros[posicionLibro] = libro;
	}

	private static int buscarPosiciónLibro(String codigo) {
		int posicion = -1;
		for (int i = 0; i < tablaLibros.length; i++) {
			Libro libro = tablaLibros[i];
			if (libro.getCodigo().equals(codigo)) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}

	public static Libro buscarLibroPorCodigo(String codigo) {
		Libro libro = null;
		for (int i = 0; i < tablaLibros.length; i++) {
			Libro libroTablero = tablaLibros[i];
			if (libroTablero != null && libroTablero.getCodigo().equals(codigo)) {
				libro = libroTablero;
				break;
			}
		}
		return libro;
	}

	public static List<Libro> buscarLibroPorNombre(String nombre) {
		List<Libro> listaLibros = new ArrayList<Libro>();
		for (int i = 0; i < tablaLibros.length; i++) {
			Libro libro = tablaLibros[i];
			if (libro.getNombre().contains(nombre)) {
				listaLibros.add(libro);
			}
		}
		return listaLibros;
	}

	public static List<Libro> buscarLibroPorNombreAutor(String nombreAutor) {
		List<Libro> listaLibros = new ArrayList<Libro>();
		for (int i = 0; i < tablaLibros.length; i++) {
			Libro libro = tablaLibros[i];
			if (libro.getAutor().getNombre().contains(nombreAutor)) {
				listaLibros.add(libro);
			}
		}
		return listaLibros;
	}

	public void eliminarLibro() {
		// No vamos implementar
	}
}
