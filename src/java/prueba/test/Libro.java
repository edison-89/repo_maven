package prueba.test;

import java.util.Date;

public class Libro {

	private String codigo;
	private String nombre;
	private String estado;
	private Date fechaEntrega;
	private Autor autor;

	public Libro(String codigo, String nombre, String estado, Date fechaEntrega, Autor autor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.fechaEntrega = fechaEntrega;
		this.autor = autor;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", estado=" + estado + ", fechaEntrega="
				+ fechaEntrega + ", autor=" + autor + "]";
	}
	
	
}
