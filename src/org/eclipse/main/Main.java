package org.eclipse.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.classes.Enseignant;
import org.eclipse.classes.Etudiant;
import org.eclipse.classes.Exemple;
import org.eclipse.classes.Humain;
import org.eclipse.classes.Operation;
import org.eclipse.classes.Personne;
import org.eclipse.classes.Vehicule;

import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------");

		Humain<Personne> hum1 = new Humain<Personne>();
		Humain<Enseignant> hum2 = new Humain<Enseignant>();
		
		// Instruction soulignee en rouge car Vehicule n'herite pas de 
		// la classe Personne
		// Humain<Vehicule> hum3 = new Humain<Vehicule>();
		
		Exemple<Integer, String> couple = new Exemple<Integer, String>();

		couple.setVar1(10);
		couple.setVar2("Bonjour");

		System.out.println(couple.getVar1().getClass().getTypeName() + " " + couple.getVar1()); // java.lang.Integer 10
		System.out.println(couple.getVar2().getClass().getTypeName() + " " + couple.getVar2()); // java.lang.String
																								// Bonjour

		System.out.println("------------------------------------------------------------");

		
		Operation<Integer> operation1 = new Operation<Integer>(5, 3);
		operation1.plus();
		Operation<String> operation2 = new Operation<String>("bon", "jour");
		operation2.plus();
		Operation<Double> operation3 = new Operation<Double>(5.2, 3.8);
		operation3.plus();
		Operation<Boolean> operation4 = new Operation<Boolean>(true, false);
		operation4.plus();

		System.out.println("------------------------------------------------------------");

		// Avec genericite
		LinkedList<String> list = new LinkedList<String>();

		// Ajouter des elements
		list.add("Hello");
		list.add("Bonjour");
		list.add("Ola");

		// Ajouter l element a la fin de la liste comme add()
		list.addLast("Olé");

		// Ajouter l element en premiere position
		list.addFirst("Salut");

		// Inserer l lement specifie en position index 1
		list.add(1, "Hi");

		// Affiche la liste
		list.forEach((item) -> System.out.println("List before deleting : " + item));

		// Supprimer le premier et le dernier element
		list.removeFirst();
		list.removeLast();

		list.forEach((item) -> System.out.println("List after deleting : " + item));

		// Recuperer la valeur selon son indice
		String val = list.get(2);

		// Modifier la valeur selon son indice
		list.set(2, val + " changed");

		list.forEach((item) -> System.out.println("List after change : " + item));

		System.out.println("------------------------------------------------------------");

		// Pour convertir un tableau en liste
		List<Integer> numList = Arrays.asList(2, 7, 1, 3);

		numList.forEach((n) -> System.out.println(n));

		System.out.println("------------------------------------------------------------");

		// Hashset cree une collection qui utilise une table de hachage
		// table de hachage -> stocke les valeurs en leur donnant une cle unique pour
		// les identifier
		HashSet<String> hSet = new HashSet<String>();

		hSet.add("hotel");
		// N'accepte pas les doublons
		hSet.add("hotel");

		hSet.add("motel");
		hSet.add("camping");
		hSet.add("gite");

		// Pour recuperer l element convertir le set en Array
		String[] array = hSet.toArray(new String[hSet.size()]);

		System.out.println("Element : " + array[2]);

		// Afficher la taille du Set
		System.out.println(hSet.size());

		// Supprimer l'objet motel
		hSet.remove("motel");

		System.out.println(hSet.contains("motel"));

		System.out.println(hSet.isEmpty());

		for (String value : hSet) {
			System.out.println(value);
		}

		hSet.forEach((value) -> System.out.println(value));

		System.out.println("------------------------------------------------------------");

		Integer[] tab = { 2, 3, 5, 1, 9 };

		List<Integer> ent = Arrays.asList(tab);

		ent.forEach((value) -> System.out.println(value));

		System.out.println("------------------------------------------------------------");

		// Dictionnaire -> contient des pairs <clé, valeurs>

		HashMap<String, Double> map = new HashMap<String, Double>();

		map.put("A", 14.0);
		map.put("B", 36.5);
		map.put("C", 21.7);
		map.put("D", 54.7);

		// recupere une valeur selon sa clé
		Double v1 = map.get("A");
		System.out.println(v1);

		// Supprimer une valeur selon une clé
		map.remove("B");

		// Retourne l'ensemble de clé valeur, utiliser entrySet()
		for (Entry<String, Double> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

		Set s = map.entrySet();

		// Iterator est une interface qui appartient au framework collection.
		// Il nous permet de parcourir la collection, d’accéder à l’élément et supprimer
		// les éléments de la collection
		Iterator it = s.iterator();

		// boolean hasNext(): il retourne true si Iterator a plus d’élément à itérer
		while (it.hasNext()) {
			// Object next(): il retourne l’élément suivant dans la collection jusqu’à ce
			// que la méthode hasNext() retourne true
			System.out.println(it.next());
		}

		System.out.println("----------------------------EXOS ARRAYLIST--------------------------------");

		final List<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
		listeEtudiants.add(new Etudiant("Dupont", "0123"));
		listeEtudiants.add(new Etudiant("Delafontaine", "1025"));
		listeEtudiants.add(new Etudiant("Pichon", "5520"));
		listeEtudiants.add(new Etudiant("Perrin", "0011"));
		listeEtudiants.add(new Etudiant("Delaune", "9250"));

		// afficher la liste
		System.out.println(listeEtudiants);

		// trouver les noms des étudiants par leur numeros
		System.out.println(trouverEtudiantParNumero("0123", listeEtudiants));

		// trouver les numéro des étudiants par leur noms
		System.out.println(trouverEtudiantParNom("Dupont", listeEtudiants));

		// afficher les numeros
		System.out.println(afficherNumeros(listeEtudiants));

		System.out.println("----------------------------EXOS MAP--------------------------------");

		final Map<String, String> mapCatalogue = new HashMap<>();

		mapCatalogue.put("0123", "Dupont");
		mapCatalogue.put("1025", "Delafontaine");
		mapCatalogue.put("5520", "Pichon");
		mapCatalogue.put("0011", "Perrin");
		mapCatalogue.put("9250", "Delaune");

		// afficher la map
		System.out.println(mapCatalogue);

		// trouver les etudiants par leurs numéros
		System.out.println(mapCatalogue.get("0123"));

		// trouver les numéro des étudiants par leur noms
		System.out.println(Main.trouverEtudiantParNom("Dupont", mapCatalogue));

		// afficher les numeros
		for (Entry<String, String> entry : mapCatalogue.entrySet()) {
			System.out.println("Les numeros sont : " + entry.getKey());
		}
		
		List<? super Integer> list1 = new ArrayList<Number>(); // Number est bien la super classe de Integer
		
		List<? extends Number> list2 = new ArrayList<Integer>(); // Integer extends Number
		
		List<? super Integer> list3 = new ArrayList<Object>(); // Object est bien la super classe de Integer
		
		List<? super String> list4 = new ArrayList<Object>(); // Object est bien la super classe de String

	}

	// trouver nom etudiant dans une liste par son numero d'etudiant.
	public static String trouverEtudiantParNumero(String numero, List<Etudiant> liste) {
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNumero().equals(numero)) {
				return liste.get(i).getNom();
			}
		}
		return ("Aucun etudiant avec ce numero !");
	}

	// trouver numero etudiant dans un liste par son nom.
	public static String trouverEtudiantParNom(String nom, List<Etudiant> liste) {
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNom().equals(nom)) {
				return liste.get(i).getNumero();
			}
		}
		return ("Aucun etudiant avec ce nom !");
	}

	public static String afficherNumeros(List<Etudiant> liste) {
		for (int i = 0; i < liste.size(); i++) {
			return liste.get(i).getNumero();
		}
		return null;
	}

	// trouver numero etudiant dans une map par son nom.
	public static String trouverEtudiantParNom(String nom, Map<String, String> map) {
		Set<String> lesCles = map.keySet();
		boolean trouve = false;
		String nomTrouve = "";
		Iterator<String> monIterateur = lesCles.iterator();
		while (!trouve && monIterateur.hasNext()) {
			nomTrouve = monIterateur.next();
			if (map.get(nomTrouve).equals(nom)) {
				return nomTrouve;
			}
		}
		return ("Aucun etudiant avec ce nom !");
	}

}
