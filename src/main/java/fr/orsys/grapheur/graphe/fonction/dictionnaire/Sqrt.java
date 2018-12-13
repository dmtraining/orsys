package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Sqrt extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Sqrt(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.sqrt(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "sqrt(" + getTexteSousFonctions() + ")";
	}

}