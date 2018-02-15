package com.ao.portal.modelo.enun;

public enum MotivoAusencia {

	
	TRABALHO_EXTERNO(1, "Trabalho Externo"),
	DOENCA(2,"Doenca"),
	CONSULTA_MEDICA(3, "Consulta medica"),
	FILHOS_MENORES(4, "Filhos menores"),
	FERIAS(5,"Ferias");
	
	
	private int cod;
	private String descricao;
	
	private MotivoAusencia(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public static MotivoAusencia toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (MotivoAusencia x : MotivoAusencia.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
