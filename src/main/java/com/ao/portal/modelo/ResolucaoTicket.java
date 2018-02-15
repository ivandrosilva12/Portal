package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ao.portal.modelo.enun.TicketStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ResolucaoTicket implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataResolucao;
	private String comentarios;
	private Integer status;

	
	
	
	public ResolucaoTicket(Integer id, Date dataResolucao, String comentarios, TicketStatus status) {
		super();
		this.id = id;
		this.dataResolucao = dataResolucao;
		this.comentarios = comentarios;
		this.status = status.getCod();
	}


	public ResolucaoTicket() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDataResolucao() {
		return dataResolucao;
	}


	public void setDataResolucao(Date dataResolucao) {
		this.dataResolucao = dataResolucao;
	}


	public String getComentarios() {
		return comentarios;
	}


	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}


	public TicketStatus getStatus() {
		return TicketStatus.toEnum(status);
	}


	public void setStatus(TicketStatus status) {
		this.status = status.getCod();
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
		ResolucaoTicket other = (ResolucaoTicket) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




}
