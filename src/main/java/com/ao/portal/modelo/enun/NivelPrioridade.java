package com.ao.portal.modelo.enun;

public enum NivelPrioridade {

	
	BAIXO(1, "Baixo"),
	NORMAL(2,"Normal"),
	ALTO(3, "Alto"),
	ELEVADO(4, "Elevado");
	
	
	private int cod;
	private String descricao;
	
	private NivelPrioridade(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public static NivelPrioridade toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (NivelPrioridade x : NivelPrioridade.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
