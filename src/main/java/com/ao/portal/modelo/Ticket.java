package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ao.portal.modelo.enun.NivelPrioridade;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String categoriaProblema;
	private String subCategoriraProblema;
	private String area;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataAvaria;
	private String motivoAvaria;
	private NivelPrioridade nivel;
	
	
	public Ticket() {
	}

		
	
}
