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
	private int idCliente;
	@ManyToOne
	@JoinColumn(name = "id_cuenta")
	private int idCuenta;
	
	/**
	 * 
	 * @param id
	 * @param idCliente
	 * @param idCuenta
	 */
	public Pertenece(int id, int idCliente, int idCuenta) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idCuenta = idCuenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

}
