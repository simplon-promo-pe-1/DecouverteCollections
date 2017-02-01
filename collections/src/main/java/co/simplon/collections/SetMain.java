package co.simplon.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import co.simplon.collections.modele.Animal;

public class SetMain {

	public static void main(String[] args) {
		Set<Animal> premierAnimaux = creerArcheDeNoe();
	
		afficherArcheAvecFor(premierAnimaux);
		System.out.println("");
		afficherArcheAvecWhile(premierAnimaux);
		System.out.println("");		
	}

	private static void afficherArcheAvecWhile(Set<Animal> animaux) {
		Iterator<Animal> it = animaux.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void afficherArcheAvecFor(Set<Animal> animaux) {
		for (Animal animal : animaux) {
			System.out.println(animal);
		}
	}

	private static Set<Animal> creerArcheDeNoe() {
		Set<Animal> animaux = new TreeSet<Animal>();
		System.out.println(animaux.add(new Animal("Chat", 18)));
		animaux.add(new Animal("Chien", 20));
		animaux.add(new Animal("Loup",25));
		animaux.add(new Animal("Poule", 6));
		animaux.add(new Animal("Renard", 18));
		System.out.println(animaux.add(new Animal("Chat", 18)));
		return animaux;
	}
	
}
