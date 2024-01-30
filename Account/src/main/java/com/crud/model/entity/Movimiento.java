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
	private Cuenta cuenta;
	private String idCuentaOrigen;
	private String idCuentaDestino;
	private double cantidad;
	private Date fecha;
	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private Tipo tipo;

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
	public Movimiento(int id, Cuenta cuenta, String idCuentaOrigen, String idCuentaDestino, double cantidad, Date fecha,
			Tipo tipo) {
		super();
		this.id = id;
		this.cuenta = cuenta;
		this.idCuentaOrigen = idCuentaOrigen;
		this.idCuentaDestino = idCuentaDestino;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getIdCuentaOrigen() {
		return idCuentaOrigen;
	}

	public void setIdCuentaOrigen(String idCuentaOrigen) {
		this.idCuentaOrigen = idCuentaOrigen;
	}

	public String getIdCuentaDestino() {
		return idCuentaDestino;
	}

	public void setIdCuentaDestino(String idCuentaDestino) {
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}
