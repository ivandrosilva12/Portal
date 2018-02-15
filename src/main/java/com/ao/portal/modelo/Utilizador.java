package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Utilizador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	private boolean status;
	private String nivel;	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataCriacao;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataMudancaPassword;
		
	@JsonIgnore
	@OneToMany(mappedBy="utilizador")
	private List<Publicacao> publicacoes = new ArrayList<>();
	
	
	public Utilizador() {
	}

	public Utilizador(Integer id, String username, String password, boolean status, String nivel, Date dataCriacao,
			Date dataMudancaPassword) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.status = status;
		this.nivel = nivel;
		this.dataCriacao = dataCriacao;
		this.dataMudancaPassword = dataMudancaPassword;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataMudancaPassword() {
		return dataMudancaPassword;
	}

	public void setDataMudancaPassword(Date dataMudancaPassword) {
		this.dataMudancaPassword = dataMudancaPassword;
	}

	
	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
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
		Utilizador other = (Utilizador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



}
