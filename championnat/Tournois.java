package fr.heighties.championnat;

public class Tournois {

	public static void main(String[] args) throws Exception {

		Joueurs un = new Joueurs("Geoffrey", 1500, 0);
		Joueurs deux = new Joueurs("Paul", 1500, 0);
		Joueurs trois = new Joueurs("Bruno", 1500, 0);
		Joueurs quatre = new Joueurs("Nima", 1500, 0);

		Joueurs cinq = new Joueurs("Thomas", 1500, 0);
		Joueurs six = new Joueurs("Remy", 1500, 0);
		Joueurs sept = new Joueurs("Justine", 1500, 0);
		Joueurs huit = new Joueurs("Yoann", 1500, 0);

		Joueurs cent = new Joueurs("Champion du monde", 2000);

		Joueurs[] liste = { un, deux, trois, quatre };

		// premieres parties

		//
		un.affronte(deux);

		trois.affronte(quatre);

		cinq.affronte(six);

		sept.affronte(huit);
		//

		// les joueurs avec une victoire s'affrontent

		if (un.getVictoires() >= 1 && trois.getVictoires() >= 1) {
			un.affronte(trois);

		}
		if (un.getVictoires() >= 1 && quatre.getVictoires() >= 1) {
			un.affronte(quatre);

		}
		if (deux.getVictoires() >= 1 && trois.getVictoires() >= 1) {
			deux.affronte(trois);
		}
		if (deux.getVictoires() >= 1 && quatre.getVictoires() >= 1) {
			deux.affronte(quatre);
		}
		if (cinq.getVictoires() >= 1 && sept.getVictoires() >= 1) {
			cinq.affronte(sept);

		}
		if (cinq.getVictoires() >= 1 && huit.getVictoires() >= 1) {
			cinq.affronte(huit);

		}
		if (six.getVictoires() >= 1 && sept.getVictoires() >= 1) {
			six.affronte(sept);
		}
		if (six.getVictoires() >= 1 && huit.getVictoires() >= 1) {
			six.affronte(huit);
		}

		// vainqueur

		for (int i = 0; i < liste.length; i++) {
			if (liste[i].getVictoires() == 2) {
				System.out.println(
						" Le vainqueur du tournois est " + liste[i].getName() + " il a " + liste[i].getElo() + " elo ");
				liste[i].affronte(cent);

				break;
			}
		}
	}
}