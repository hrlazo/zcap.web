package cl.inacap.zCapModel.dto;

import java.util.List;

public class Consola {
	
	private String nombreConsola;
	private String marcaConsola;
	private int lanzamiento;
	private List<Videojuego> juegos;
	
	public String getNombreConsola() {
		return nombreConsola;
	}
	public void setNombreConsola(String nombreConsola) {
		this.nombreConsola = nombreConsola;
	}
	public String getMarcaConsola() {
		return marcaConsola;
	}
	public List<Videojuego> getJuegos() {
		return juegos;
	}
	public void setJuegos(List<Videojuego> juegos) {
		this.juegos = juegos;
	}
	public void setMarcaConsola(String marcaConsola) {
		this.marcaConsola = marcaConsola;
	}
	public int getLanzamiento() {
		return lanzamiento;
	}
	public void setLanzamiento(int lanzamiento) {
		this.lanzamiento = lanzamiento;
	}
	
	
}
