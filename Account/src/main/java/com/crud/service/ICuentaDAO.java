/**
 * 
 */
package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.entity.Cuenta;

/**
 * @author Palmira
 *
 */
@Repository
public interface ICuentaDAO extends JpaRepository<Cuenta, String>{

}
