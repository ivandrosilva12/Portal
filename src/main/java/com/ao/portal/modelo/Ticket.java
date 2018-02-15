package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.ao.portal.modelo.enun.NivelPrioridade;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private String categoriaProblema;
	private String subCategoriraProblema;
	private String area;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataAvaria;
	private String motivoAvaria;
	private NivelPrioridade nivel;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="resolucaoTicket_id")
	@MapsId
	private ResolucaoTicket resolucao;
	
	
	public Ticket() {
	}


	public Ticket(Integer id, String categoriaProblema, String subCategoriraProblema, String area, Date dataAvaria,
			String motivoAvaria, NivelPrioridade nivel, ResolucaoTicket resolucao) {
		super();
		this.id = id;
		this.categoriaProblema = categoriaProblema;
		this.subCategoriraProblema = subCategoriraProblema;
		this.area = area;
		this.dataAvaria = dataAvaria;
		this.motivoAvaria = motivoAvaria;
		this.nivel = nivel;
		this.resolucao = resolucao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoriaProblema() {
		return categoriaProblema;
	}

	public void setCategoriaProblema(String categoriaProblema) {
		this.categoriaProblema = categoriaProblema;
	}

	public String getSubCategoriraProblema() {
		return subCategoriraProblema;
	}

	public void setSubCategoriraProblema(String subCategoriraProblema) {
		this.subCategoriraProblema = subCategoriraProblema;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getDataAvaria() {
		return dataAvaria;
	}

	public void setDataAvaria(Date dataAvaria) {
		this.dataAvaria = dataAvaria;
	}

	public String getMotivoAvaria() {
		return motivoAvaria;
	}

	public void setMotivoAvaria(String motivoAvaria) {
		this.motivoAvaria = motivoAvaria;
	}

	public NivelPrioridade getNivel() {
		return nivel;
	}

	public void setNivel(NivelPrioridade nivel) {
		this.nivel = nivel;
	}

	public ResolucaoTicket getResolucao() {
		return resolucao;
	}

	public void setResolucao(ResolucaoTicket resolucao) {
		this.resolucao = resolucao;
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
		Ticket other = (Ticket) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
