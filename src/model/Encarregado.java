package model;

public class Encarregado extends Pessoa{
	private String 	contacto,
					contacto_alternativo;

	public Encarregado(int iD, String nome, String data_nascimento, String ccidadao, String contacto,
			String contacto_alternativo) {
		super(iD, nome, data_nascimento, ccidadao);
		this.contacto = contacto;
		this.contacto_alternativo = contacto_alternativo;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getContacto_alternativo() {
		return contacto_alternativo;
	}

	public void setContacto_alternativo(String contacto_alternativo) {
		this.contacto_alternativo = contacto_alternativo;
	}
	
}
