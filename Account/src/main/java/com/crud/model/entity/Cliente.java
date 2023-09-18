/**
 * 
 */
package com.crud.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */

@Entity
@Table(name = "entity")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idCliente;
	String nif;
	String nombre;
	String apellidos;
	Date fechaNacimiento;

	public Cliente(int idCliente, String nif, String nombre, String apellidos, Date fechaNacimiento) {
		super();
		this.idCliente = idCliente;
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

}
