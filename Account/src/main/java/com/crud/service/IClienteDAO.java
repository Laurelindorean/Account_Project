/**
 * 
 */
package com.crud.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.entity.Cliente;

/**
 * @author Palmira
 *
 */
@Repository
public interface IClienteDAO extends JpaRepository<Cliente, Integer> {

	public Cliente findClienteById(int id);

	public Cliente findClinteByDni(String dni);

	public Cliente findClienteByNombreApellidos(String nombre, String apellidos);

	public List<Cliente> findClientesByCuenta(int id);

}
