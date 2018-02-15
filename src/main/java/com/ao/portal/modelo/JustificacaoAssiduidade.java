package com.ao.portal.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.ao.portal.modelo.enun.MotivoAusencia;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class JustificacaoAssiduidade implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date dataJustificacao;
	private boolean aprovado;
	private String periodo;
	private String urlJustificativo;
	private Integer motivo;	
	
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date horaSaida;
	@JsonFormat(pattern="dd/MM/yyyy hh:mm")
	private Date data;

	public JustificacaoAssiduidade() {
	}	
	
	public JustificacaoAssiduidade(Integer id, Date dataJustificacao, boolean aprovado, String periodo,
			String urlJustificativo, MotivoAusencia motivo, Date horaSaida, Date data) {
		super();
		this.id = id;
		this.dataJustificacao = dataJustificacao;
		this.aprovado = aprovado;
		this.periodo = periodo;
		this.urlJustificativo = urlJustificativo;
		this.motivo = motivo.getCod();
		this.horaSaida = horaSaida;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataJustificacao() {
		return dataJustificacao;
	}

	public void setDataJustificacao(Date dataJustificacao) {
		this.dataJustificacao = dataJustificacao;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getUrlJustificativo() {
		return urlJustificativo;
	}

	public void setUrlJustificativo(String urlJustificativo) {
		this.urlJustificativo = urlJustificativo;
	}

	public MotivoAusencia getMotivo() {
		return MotivoAusencia.toEnum(motivo);
	}

	public void setMotivo(MotivoAusencia motivo) {
		this.motivo = motivo.getCod();
	}
	
	public Date getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Date horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
		JustificacaoAssiduidade other = (JustificacaoAssiduidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
