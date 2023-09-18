/**
 * 
 */
package com.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author A200253764
 *
 */
@RestController
@RequestMapping("/api")
public class ControllerTest {
	
	@GetMapping("/prueba")
	public String prueba() {
		return "Hola Mundo";
	}

}
