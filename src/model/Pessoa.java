package model;

public class Pessoa {
	private int		ID;
	private String	nome,
					data_nascimento,
					ccidadao;
	
	public Pessoa(int iD, String nome, String data_nascimento, String ccidadao) {
		super();
		ID = iD;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.ccidadao = ccidadao;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getCcidadao() {
		return ccidadao;
	}
	public void setCcidadao(String ccidadao) {
		this.ccidadao = ccidadao;
	}
}
