/**
 * 
 */
package com.crud.model.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */

@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String banco;
	private String nombre;
	private int idPais;
	private Date fechaAlta;
	private Date fechaBaja;
	private boolean activa;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuenta")
	private List<Pertenece> pertenece;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuenta")
	private List<Movimiento> movimiento;

	/**
	 * 
	 * @param id
	 * @param banco
	 * @param nombre
	 * @param idPais
	 * @param fechaAlta
	 * @param fechaBaja
	 * @param activa
	 * @param pertenece
	 * @param movimiento
	 */
	public Cuenta(String id, String banco, String nombre, int idPais, Date fechaAlta, Date fechaBaja, boolean activa,
			List<Pertenece> pertenece, List<Movimiento> movimiento) {
		super();
		this.id = id;
		this.banco = banco;
		this.nombre = nombre;
		this.idPais = idPais;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.activa = activa;
		this.pertenece = pertenece;
		this.movimiento = movimiento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	@JsonIgnore
	public List<Pertenece> getPertenece() {
		return pertenece;
	}

	public void setPertenece(List<Pertenece> pertenece) {
		this.pertenece = pertenece;
	}

	@JsonIgnore
	public List<Movimiento> getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(List<Movimiento> movimiento) {
		this.movimiento = movimiento;
	}

}
