package co.simplon.collections.modele;

public class Animal implements Comparable<Animal> {
	private String race;
	private int esperanceDeVie;
	
	public Animal(String race, int esperanceDeVie) {
		super();
		this.race = race;
		this.esperanceDeVie = esperanceDeVie;
	}

	@Override
	public int compareTo(Animal autreAnimal) {
		int difference = this.esperanceDeVie - autreAnimal.esperanceDeVie;
		if (difference == 0) {
			return this.race.compareTo(autreAnimal.race);
		}
		return difference;
	}
	
	@Override
	public String toString() {
		return "Animal [race=" + race + ", esperanceDeVie=" + esperanceDeVie
				+ "]";
	}
	
	public String getRace() {
		return race;
	}

	public int getEsperanceDeVie() {
		return esperanceDeVie;
	}
}
