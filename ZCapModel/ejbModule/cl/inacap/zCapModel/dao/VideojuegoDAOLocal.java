package cl.inacap.zCapModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.zCapModel.dto.Videojuego;

@Local
public interface VideojuegoDAOLocal {

	void save(Videojuego juego);
	List<Videojuego> getAll();
	void delete(Videojuego juego);
	List<Videojuego> filterByName(String nombre);
	
}
