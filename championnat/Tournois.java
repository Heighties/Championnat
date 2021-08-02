package fr.heighties.championnat;

import java.util.ArrayList;
import java.util.List;

public class Tournois {

	public static void main(String[] args) throws Exception {

		List<Joueurs> qualifies = initialisationDuTournois();

		Joueurs cent = new Joueurs("Magnus Carlsen", 2000);
		int round = 1;
		while (qualifies.size() > 1) {
			System.out.println("round " + round);
			qualifies = roundJouee(qualifies);
			round++;
		}
		Joueurs vainqueur = qualifies.get(0);
		System.out.println("Le vainqueur est " + vainqueur.getName());

		Joueurs nouveauChampionDuMonde = vainqueur.getWinner(cent);
		if (nouveauChampionDuMonde == cent) {
			System.out.println("Magnus Carlsen reste champion du monde!");
		} else {
			System.out.println("Le nouveau champion du monde est " + nouveauChampionDuMonde.getName());

		}

	}

	private static List<Joueurs> initialisationDuTournois() {
		List<Joueurs> qualifies = new ArrayList<>();

		qualifies.add(new Joueurs("Geoffrey", 1500));
		qualifies.add(new Joueurs("Paul", 1500));
		qualifies.add(new Joueurs("Bruno", 1500));
		qualifies.add(new Joueurs("Nima", 1500));

		qualifies.add(new Joueurs("Thomas", 1500));
		qualifies.add(new Joueurs("Remy", 1500));
		qualifies.add(new Joueurs("Justine", 1500));
		qualifies.add(new Joueurs("Yoann", 1500));
		return qualifies;
	}

	private static List<Joueurs> roundJouee(List<Joueurs> qualifies) {
		List<Joueurs> nextqualifies = new ArrayList<>();
		for (int i = 0; i < qualifies.size(); i = i + 2) {
			Joueurs un = qualifies.get(i);
			Joueurs deux = qualifies.get(i + 1);
			Joueurs gagnant = un.getWinner(deux);

			nextqualifies.add(gagnant);

		}
		qualifies = nextqualifies;
		return qualifies;

	}

}
