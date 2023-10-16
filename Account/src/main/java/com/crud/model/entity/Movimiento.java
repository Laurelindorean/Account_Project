/**
 * 
 */
package com.crud.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */

@Entity
@Table(name = "movimiento")
public class Movimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_cuenta")
	private int idCuenta;
	private int idCuentaOrigen;
	private int idCuentaDestino;
	private double cantidad;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private int idTipo;

	/**
	 * 
	 * @param id
	 * @param idCuenta
	 * @param idCuentaOrigen
	 * @param idCuentaDestino
	 * @param cantidad
	 * @param fecha
	 * @param idTipo
	 */
	public Movimiento(int id, int idCuenta, int idCuentaOrigen, int idCuentaDestino, double cantidad, Date fecha,
			int idTipo) {
		super();
		this.id = id;
		this.idCuenta = idCuenta;
		this.idCuentaOrigen = idCuentaOrigen;
		this.idCuentaDestino = idCuentaDestino;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.idTipo = idTipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public int getIdCuentaOrigen() {
		return idCuentaOrigen;
	}

	public void setIdCuentaOrigen(int idCuentaOrigen) {
		this.idCuentaOrigen = idCuentaOrigen;
	}

	public int getIdCuentaDestino() {
		return idCuentaDestino;
	}

	public void setIdCuentaDestino(int idCuentaDestino) {
		this.idCuentaDestino = idCuentaDestino;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

}
