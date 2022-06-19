package org.eclipse.classes;

public class Enseignant extends Personne {

	private double salaire;

	public Enseignant() {
		// TODO Auto-generated constructor stub
	}

	public Enseignant(int id, String nom, String prenom, double salaire) {
		this.salaire = salaire;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString() + "Enseignant [salaire=" + salaire + "]";
	}

}
