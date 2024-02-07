/**
 * 
 */
package com.crud.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.entity.Cliente;

/**
 * @author Palmira
 *
 */
public interface IClienteDAO extends JpaRepository<Cliente, Integer>{

}
