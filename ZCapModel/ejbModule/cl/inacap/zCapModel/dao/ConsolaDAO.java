package cl.inacap.zCapModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.zCapModel.dto.Consola;

/**
 * Session Bean implementation class ConsolaDAO
 */
@Stateless
@LocalBean
public class ConsolaDAO implements ConsolaDAOLocal {
    
	public static List<Consola> consolas = new ArrayList<>();

	@Override
	public void save(Consola consola) {
		consolas.add(consola);
	}

	@Override
	public List<Consola> getAll() {
		return consolas;
	}
	@Override
	public void delete(Consola consola) {
		consolas.remove(consola);
	}
	@Override
	public List<Consola> filterByName(String nombre) {
		//c->c.cosas por cada implica que por cada consola buscaremos alguna que contenga el nombre para 
		//finalmente convertirlos en una lista
		return consolas.stream().filter(c->c.getNombreConsola().contains(nombre)).collect(Collectors.toList());
	}

}
