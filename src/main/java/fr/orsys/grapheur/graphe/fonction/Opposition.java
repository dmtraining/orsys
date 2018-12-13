package fr.orsys.grapheur.graphe.fonction;

/**
 * 
 * @author guehenneux
 * 
 */
public class Opposition extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Opposition(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return -parametres[0];
	}

	@Override
	public String getTexte() {
		return "-" + sousFonctions[0].getTexte();
	}

}