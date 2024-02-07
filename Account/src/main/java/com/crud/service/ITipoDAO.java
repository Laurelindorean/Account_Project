/**
 * 
 */
package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.entity.Tipo;

/**
 * @author Palmira
 *
 */
@Repository
public interface ITipoDAO extends JpaRepository<Tipo, Integer>{

}
