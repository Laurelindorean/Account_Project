/**
 * 
 */
package com.crud.model.dto.tipo;

import java.util.List;

import com.crud.model.entity.Movimiento;

/**
 * @author Palmira
 *
 */
public class TipoDto {

	private int id;
	private String nombre;
	private List<Movimiento> movimiento;

	public TipoDto(int id, String nombre, List<Movimiento> movimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.movimiento = movimiento;
	}

	public TipoDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Movimiento> getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(List<Movimiento> movimiento) {
		this.movimiento = movimiento;
	}

}
