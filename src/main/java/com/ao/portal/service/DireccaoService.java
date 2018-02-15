package com.ao.portal.service;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ao.portal.modelo.Direccao;
import com.ao.portal.repositorios.DireccaoRepositorio;

@Service
public class DireccaoService {
	
	@Autowired
	private DireccaoRepositorio repo;
	
	public Direccao buscar(Integer id) {
		
		Direccao obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Direccao.class.getName(), null);
		}
		return obj;
	}

}
