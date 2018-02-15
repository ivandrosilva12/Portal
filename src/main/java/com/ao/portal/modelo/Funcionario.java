package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String pai;
	private String mae;
	private String tipoID;
	private String nrID;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date emissaoID;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date validadeID;
	private String naturalidade;
	private String nacionalidade;
	private String provincia;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataNascimento;
	private String sexo;
	private String estadoCivil;
	private double altura;
	private boolean status;
	private String condicao;	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataRegisto;
		
	public Funcionario() {
	}


	
	public Funcionario(Integer id, String nome, String pai, String mae, String tipoID, String nrID, Date emissaoID,
			Date validadeID, String naturalidade, String nacionalidade, String provincia, Date dataNascimento,
			String sexo, String estadoCivil, double altura, boolean status, String condicao, Date dataRegisto) {
		super();
		this.id = id;
		this.nome = nome;
		this.pai = pai;
		this.mae = mae;
		this.tipoID = tipoID;
		this.nrID = nrID;
		this.emissaoID = emissaoID;
		this.validadeID = validadeID;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
		this.provincia = provincia;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.altura = altura;
		this.status = status;
		this.condicao = condicao;
		this.dataRegisto = dataRegisto;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getPai() {
		return pai;
	}



	public void setPai(String pai) {
		this.pai = pai;
	}



	public String getMae() {
		return mae;
	}



	public void setMae(String mae) {
		this.mae = mae;
	}



	public String getTipoID() {
		return tipoID;
	}



	public void setTipoID(String tipoID) {
		this.tipoID = tipoID;
	}



	public String getNrID() {
		return nrID;
	}



	public void setNrID(String nrID) {
		this.nrID = nrID;
	}



	public Date getEmissaoID() {
		return emissaoID;
	}



	public void setEmissaoID(Date emissaoID) {
		this.emissaoID = emissaoID;
	}



	public Date getValidadeID() {
		return validadeID;
	}



	public void setValidadeID(Date validadeID) {
		this.validadeID = validadeID;
	}



	public String getNaturalidade() {
		return naturalidade;
	}



	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getEstadoCivil() {
		return estadoCivil;
	}



	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public String getCondicao() {
		return condicao;
	}



	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}



	public Date getDataRegisto() {
		return dataRegisto;
	}



	public void setDataRegisto(Date dataRegisto) {
		this.dataRegisto = dataRegisto;
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
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




}
