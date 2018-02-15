package com.ao.portal.service;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ao.portal.modelo.Direccao;
import com.ao.portal.repositorios.DireccaoRepositorio;

@Service
public class DireccaoService {
	
	@Autowired
	private DireccaoRepositorio repo;
	
	public List<Direccao> getAllDireccoes(){
		
		List<Direccao> obj = repo.findAll();
		if (obj == null) {
			throw new ObjectNotFoundException("Nao existem Direccoes cadastradas no sistema!", null);
		}
		return obj;
	}
	
	public Direccao getDireccao(Integer id) {
		
		Direccao obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("A Direccao com o " + id
					+ " nao existe no sistema!", null);
		}
		return obj;
	}

	public void saveDireccao(Direccao direccao) {
		repo.save(direccao);		
	}
		
	
	public void removeDireccao(Integer id){
		Direccao dir = this.getDireccao(id);
		if(dir!=null) repo.delete(dir);
}	
	
	
	
	
	
	
	
	
}
