package org.eclipse.classes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Etudiant {
	private int id;
	private String nom;
	private String numero;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String numero) {
		super();
		this.nom = nom;
		this.numero = numero;
	}

	public Etudiant(int id, String nom, String numero) {
		super();
		this.id = id;
		this.nom = nom;
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", numero=" + numero + "]";
	}

	
}
