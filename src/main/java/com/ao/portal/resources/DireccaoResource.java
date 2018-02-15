package com.ao.portal.resources;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ao.portal.modelo.Direccao;
import com.ao.portal.service.DireccaoService;

@Controller
@RequestMapping(value="/direccoes")
public class DireccaoResource {
	
	@Autowired
	private DireccaoService service;
	
	
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Direccao getDireccao(@PathVariable Integer id){
		Direccao direccao = service.getDireccao(id);
		return direccao;
	}
			
	@RequestMapping(method=RequestMethod.GET)
	public String findAll(Model model){
		Iterable<Direccao> direccoes = service.getAllDireccoes();		
		model.addAttribute("direccoes", direccoes);
		return "direccao/listagem";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String saveDireccao(
			@Valid @ModelAttribute Direccao direccao,
			BindingResult bindingResult,
			Model model){
		
			// Falta proteger contra os erros
			service.saveDireccao(direccao);			
		
		model.addAttribute("direccoes", service.getAllDireccoes());
		return "direccao/tabela-direccoes";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<String> deleteDireccao(@PathVariable Integer id){
		try {
			service.removeDireccao(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
		 
}
	
