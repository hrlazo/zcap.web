package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Videojuego {

	private String nombreJuego;
	private String descripcion;
	private LocalDate fecha;
	private Consola consola;
	private int precio;
	private boolean apto;
	
	public String getNombreJuego() {
		return nombreJuego;
	}
	public Consola getConsola() {
		return consola;
	}
	public void setConsola(Consola consola) {
		this.consola = consola;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public boolean isApto() {
		return apto;
	}
	public void setApto(boolean apto) {
		this.apto = apto;
	}
	
	
	
	
}
