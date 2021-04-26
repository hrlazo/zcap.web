package cl.inacap.zCapModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.zCapModel.dto.Videojuego;

/**
 * Session Bean implementation class VideojuegoDAO
 */
@Stateless
@LocalBean
public class VideojuegoDAO implements VideojuegoDAOLocal {
	public static List<Videojuego> videojuegos = new ArrayList<>();

	@Override
	public void save(Videojuego juego) {
		videojuegos.add(juego);
	}

	@Override
	public List<Videojuego> getAll() {
		return videojuegos;
	}

	@Override
	public void delete(Videojuego juego) {
		videojuegos.remove(juego);
	}

	@Override
	public List<Videojuego> filterByName(String nombre) {
		return videojuegos.stream().filter(j->j.getNombreJuego().contains(nombre)).collect(Collectors.toList());
	}
	


	

}
