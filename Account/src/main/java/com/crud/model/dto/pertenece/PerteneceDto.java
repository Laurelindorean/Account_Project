/**
 * 
 */
package com.crud.model.dto.pertenece;

import com.crud.model.entity.Cliente;
import com.crud.model.entity.Cuenta;

/**
 * @author Palmira
 *
 */
public class PerteneceDto {

	private int id;
	private Cliente cliente;
	private Cuenta cuenta;

	public PerteneceDto(int id, Cliente cliente, Cuenta cuenta) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.cuenta = cuenta;
	}

	public PerteneceDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}
