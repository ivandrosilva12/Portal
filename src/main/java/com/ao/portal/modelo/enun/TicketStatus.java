package com.ao.portal.modelo.enun;

public enum TicketStatus {

	ABERTO(1, "Aberto"),
	EM_ANDAMENTO(2,"Em andamento"),
	FECHADO(3, "Fechado");
	
	private int cod;
	private String descricao;
	
	private TicketStatus(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public static TicketStatus toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for (TicketStatus x : TicketStatus.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
