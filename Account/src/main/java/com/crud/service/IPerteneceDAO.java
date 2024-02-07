/**
 * 
 */
package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.entity.Pertenece;

/**
 * @author Palmira
 *
 */
@Repository
public interface IPerteneceDAO extends JpaRepository<Pertenece, Integer>{

}
