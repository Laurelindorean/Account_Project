/**
 * 
 */
package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.entity.Movimiento;

/**
 * @author Palmira
 *
 */
@Repository
public interface IMovimientoDAO extends JpaRepository<Movimiento, Integer> {

}
