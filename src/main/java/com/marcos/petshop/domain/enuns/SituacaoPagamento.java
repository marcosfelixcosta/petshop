package com.marcos.petshop.domain.enuns;

public enum SituacaoPagamento {
	
	QUITADO(1, "Quitado"),
	CANCELADO(2, "Cancelado"),
	PENDENTE(3, "Pendente");
	
	private Integer cod;
	private String descricao;
	
	private SituacaoPagamento(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public static SituacaoPagamento toEnun(Integer cod) {
		
		if (cod ==null) {
		  return null;
			
		}
		
		for (SituacaoPagamento sp : SituacaoPagamento.values()) {
			
			if (cod.equals(sp.getCod())) {
			
			return sp;
		}
				
		}
		
		throw new IllegalArgumentException();
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

}
