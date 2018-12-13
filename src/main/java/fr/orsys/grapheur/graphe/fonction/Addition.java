package fr.orsys.grapheur.graphe.fonction;

/**
 * 
 * @author guehenneux
 * 
 */
public class Addition extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction0
	 * @param sousFonction1
	 */
	public Addition(Fonction sousFonction0, Fonction sousFonction1) {
		super(sousFonction0, sousFonction1);
	}

	@Override
	public double evaluer() {
		return parametres[0] + parametres[1];
	}

	@Override
	public String getTexte() {

		return sousFonctions[0].getTexte() + " + "
				+ sousFonctions[1].getTexte();

	}

}