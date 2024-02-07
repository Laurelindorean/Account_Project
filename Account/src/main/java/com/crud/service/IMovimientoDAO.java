/**
 * 
 */
package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.entity.Movimiento;

/**
 * @author Palmira
 *
 */
public interface IMovimientoDAO extends JpaRepository<Movimiento, Integer> {

}
