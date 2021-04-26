package cl.inacap.zCapModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.zCapModel.dto.Consola;

@Local
public interface ConsolaDAOLocal {

	void save(Consola consola);
		List<Consola> getAll();
	void delete(Consola consola);
		List<Consola> filterByName(String nombre);
}
