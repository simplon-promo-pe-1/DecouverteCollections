package co.simplon.collections;

import java.util.HashMap;
import java.util.Map;

import co.simplon.collections.modele.Animal;

public class MapMain {
	public static void main(String[] args) {
		Map<String, Animal> mesAnimaux = new HashMap<String, Animal>();

		// ajouts
		Animal chat = new Animal("Chat", 20);
		mesAnimaux.put("Divine", chat);
		mesAnimaux.put("Haskell", chat);

		mesAnimaux.put("Waldi", new Animal("Chien", 18));

		mesAnimaux.put("Popeye", new Animal("Oiseau", 5));

		System.out.println("Taille de mon petit zoo après initialisation : "
				+ mesAnimaux.size());

		// parcours des clés
		System.out.println();
		System.out.println("Mes animaux sont :");
		for (String cle : mesAnimaux.keySet()) {
			System.out.println(cle);
		}

		// lecture
		Animal resultat = mesAnimaux.get("Waldi");
		System.out.println();
		System.out.println("Waldi est un.e " + resultat.getRace());

		// parcours des valeurs
		System.out.println();
		System.out.println("Les races d'animaux connues à la maison sont :");
		for (Animal animal : mesAnimaux.values()) {
			System.out.println(animal.getRace());
		}

		// Mise à jour d'un élément
		System.out.println();
		Animal animalAvant = mesAnimaux.put("Popeye", new Animal("Souris", 2));
		Animal animalApres = mesAnimaux.get("Popeye");
		System.out.println("Popeye est un.e " + animalApres.getRace()
				+ " alors qu'avant il était un.e " + animalAvant.getRace());

		// Suppression d'un élément
		System.out.println();
		System.out.println("Taille de mon petit zoo avant : "
				+ mesAnimaux.size());
		Animal animalRetire = mesAnimaux.remove("Waldi");
		System.out.println("Taille de mon petit zoo après : "
				+ mesAnimaux.size());
		System.out
				.println("L'animal retiré est un.e " + animalRetire.getRace());
		Animal autreAnimalRetire = mesAnimaux.get("Minouche");
		System.out
				.println("Taille de mon petit zoo après tentative de retrait de Minouche : "
						+ mesAnimaux.size());
		System.out.println("L'animal retiré du prénom de Minouche : "
				+ autreAnimalRetire);

		// End of the game
		System.out.println();
		mesAnimaux.clear();
		System.out.println("Taille de mon petit zoo après un clear : "
				+ mesAnimaux.size());

	}
}
