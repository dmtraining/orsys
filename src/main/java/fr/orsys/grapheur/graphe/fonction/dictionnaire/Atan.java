package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Atan extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Atan(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.atan(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "atan(" + getTexteSousFonctions() + ")";
	}

}