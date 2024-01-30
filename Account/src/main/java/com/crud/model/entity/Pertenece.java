/**
 * 
 */
package com.crud.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 * @author Palmira
 *
 */
@Entity
@Table(name = "pertenece")
public class Pertenece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "id_cuenta")
	private Cuenta cuenta;
	
	/**
	 * 
	 * @param id
	 * @param cliente
	 * @param cuenta
	 */
	public Pertenece(int id, Cliente cliente, Cuenta cuenta) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.cuenta = cuenta;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the cuenta
	 */
	public Cuenta getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	

	
}
