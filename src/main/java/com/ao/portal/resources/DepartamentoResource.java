package com.ao.portal.resources;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/departamentos")
public class DepartamentoResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST IS WORKING";
	}
	
}
