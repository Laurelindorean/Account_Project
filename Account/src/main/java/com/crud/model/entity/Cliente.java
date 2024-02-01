/**
 * 
 */
package com.crud.model.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
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
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nif;
	private String nombre;
	private String apellidos;
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Pertenece> pertenece;

	/**
	 * 
	 * @param idCliente
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param pertenece
	 */
	public Cliente(int id, String nif, String nombre, String apellidos, Date fechaNacimiento,
			List<Pertenece> pertenece) {
		super();
		this.id = id;
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.pertenece = pertenece;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@JsonIgnore
	public List<Pertenece> getPertenece() {
		return pertenece;
	}

	public void setPertenece(List<Pertenece> pertenece) {
		this.pertenece = pertenece;
	}

}
