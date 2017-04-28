package model;

public class Crianca extends Pessoa{
	
	private String	observacoes;
	
	public Crianca(int iD, String nome, String data_nascimento, String ccidadao, String observacoes) {
		super(iD, nome, data_nascimento, ccidadao);
		
		this.observacoes = observacoes;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
