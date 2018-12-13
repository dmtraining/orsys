package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Sh extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Sh(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.sinh(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "sh(" + getTexteSousFonctions() + ")";
	}

}