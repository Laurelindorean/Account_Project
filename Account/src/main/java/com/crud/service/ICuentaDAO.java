/**
 * 
 */
package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.entity.Cuenta;

/**
 * @author Palmira
 *
 */
public interface ICuentaDAO extends JpaRepository<Cuenta, String>{

}
