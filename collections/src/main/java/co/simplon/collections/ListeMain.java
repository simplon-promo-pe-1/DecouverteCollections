package co.simplon.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import co.simplon.collections.modele.Animal;

public class ListeMain {

	public static void main(String[] args) {

		List<Animal> maListe = construireMaListe();
		
		// je trie ma liste
		Collections.sort(maListe);
		
		System.out.println("affichage de ma liste avec for each");
		afficherMaListeAvecForEach(maListe);
		System.out.println("");
		System.out.println("affichage de ma liste avec iterator et while");
		afficherMaListeAvecIterator(maListe);
		System.out.println("");
		System.out.println("affichage de ma liste avec iterator et for");
		afficherMaListeAvecIteratorEtFor(maListe);
		System.out.println("");
		
		List<Animal> sousListe = new ArrayList<Animal>(maListe.subList(0, 2));
		sousListe.remove(0);
		
		int size = maListe.size();
		for (int i = 0; i < size; i++) {
			System.out.println(maListe.get(i));
		}
		
		System.out.println("");
		for (Animal val : sousListe) {
			System.out.println(val);
		}
	}

	private static void afficherMaListeAvecIteratorEtFor(List<Animal> maListe) {
		Iterator<Animal> iterator = maListe.iterator();
		for (; iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	private static void afficherMaListeAvecIterator(List<Animal> maListe) {
		// Etape 2
		Iterator<Animal> it = maListe.iterator();
		while (it.hasNext()) {
			Animal element = it.next();
			System.out.println(element);
		}
	}

	private static void afficherMaListeAvecForEach(List<Animal> maListe) {
		// Etape 1b
		for (Animal elementCourant : maListe) {
			System.out.println(elementCourant);
		}
	}

	private static List<Animal> construireMaListe() {
		// Etape 1a
		List<Animal> maListe = new ArrayList<Animal>();
		maListe.add(new Animal("Chat", 18));
		maListe.add(new Animal("Chien", 20));
		maListe.add(new Animal("Loup",25));
		maListe.add(new Animal("Poule", 6));
		maListe.add(new Animal("Renard", 18));
		maListe.add(new Animal("Chat", 18));
		return maListe;
	}

}
