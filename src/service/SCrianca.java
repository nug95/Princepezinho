package service;

import java.util.ArrayList;

import model.Crianca;

public class SCrianca {
	
	private ArrayList<Crianca> arCrianca;

	public SCrianca() {
		super();
		this.arCrianca = new ArrayList<Crianca>();
	}

	public ArrayList<Crianca> getArCrianca() {
		return arCrianca;
	}

	public void setArCrianca(ArrayList<Crianca> arCrianca) {
		this.arCrianca = arCrianca;
	}
	
	
}
