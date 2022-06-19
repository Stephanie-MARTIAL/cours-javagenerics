    package org.eclipse.classes;

//<?> Autorise tout
//<? super Personne> Autorise seulement les objets de la classe personne ou ceux 
//qui ont la classe Personne comme classe fille
//<? extends Personne> Autorise seulement les objets de la classe personne ou ceux 
//dont la classe mere est Personne
public class Humain <T extends Personne>{
	
	private T var;

	
	public Humain() {
		super();
	}

	public Humain(T var) {
		super();
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return "Humain [var=" + var + "]";
	}
	
}


