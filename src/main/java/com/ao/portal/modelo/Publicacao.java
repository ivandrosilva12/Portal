package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Publicacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String assunto;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataDespacho;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataPublicacao;
	private String docURL;
	@ManyToOne
	@JoinColumn(name="utilizador_id")
	private Utilizador utilizador;
		
	public Publicacao() {
	}


	public Publicacao(Integer id, String assunto, Date dataDespacho, Date dataPublicacao, String docURL, Utilizador utilizador) {
		super();
		this.id = id;
		this.assunto = assunto;
		this.dataDespacho = dataDespacho;
		this.dataPublicacao = dataPublicacao;
		this.docURL = docURL;
		this.utilizador = utilizador;
	}

	
	public Utilizador getUtilizador() {
		return utilizador;
	}


	public void setUtilizador(Utilizador utilizador) {
		this.utilizador = utilizador;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAssunto() {
		return assunto;
	}


	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}


	public Date getDataDespacho() {
		return dataDespacho;
	}


	public void setDataDespacho(Date dataDespacho) {
		this.dataDespacho = dataDespacho;
	}


	public Date getDataPublicacao() {
		return dataPublicacao;
	}


	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}


	public String getDocURL() {
		return docURL;
	}


	public void setDocURL(String docURL) {
		this.docURL = docURL;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacao other = (Publicacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



}
