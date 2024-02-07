/**
 * 
 */
package com.crud.model.dto.movimiento;

import java.util.Date;

import com.crud.model.entity.Cuenta;
import com.crud.model.entity.Tipo;

/**
 * @author Palmira
 *
 */
public class MovimientoDto {

	private int id;
	private Cuenta cuenta;
	private String idCuentaOrigen;
	private String idCuentaDestino;
	private double cantidad;
	private Date fecha;
	private Tipo tipo;

	public MovimientoDto(int id, Cuenta cuenta, String idCuentaOrigen, String idCuentaDestino, double cantidad,
			Date fecha, Tipo tipo) {
		super();
		this.id = id;
		this.cuenta = cuenta;
		this.idCuentaOrigen = idCuentaOrigen;
		this.idCuentaDestino = idCuentaDestino;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public MovimientoDto() {

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
