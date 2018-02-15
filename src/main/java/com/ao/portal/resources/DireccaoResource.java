package com.ao.portal.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ao.portal.modelo.Direccao;
import com.ao.portal.service.DireccaoService;


@RestController
@RequestMapping(value="/direccoes")
public class DireccaoResource {
	
	@Autowired
	private DireccaoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Direccao obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
