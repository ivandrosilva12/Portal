package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ferias implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataInicio;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataFim;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataPedido;

	private int diasRestantes;
	private Date anoLaboral;
	
	public Ferias() {
	}

	public Ferias(Integer id, Date dataInicio, Date dataFim, Date dataPedido, int diasRestantes, Date anoLaboral) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.dataPedido = dataPedido;
		this.diasRestantes = diasRestantes;
		this.anoLaboral = anoLaboral;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public int getDiasRestantes() {
		return diasRestantes;
	}

	public void setDiasRestantes(int diasRestantes) {
		this.diasRestantes = diasRestantes;
	}

	public Date getAnoLaboral() {
		return anoLaboral;
	}

	public void setAnoLaboral(Date anoLaboral) {
		this.anoLaboral = anoLaboral;
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
		Ferias other = (Ferias) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
		
	
}
