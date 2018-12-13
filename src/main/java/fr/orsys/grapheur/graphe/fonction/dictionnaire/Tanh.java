package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Tanh extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Tanh(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.tanh(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "tanh(" + getTexteSousFonctions() + ")";
	}

}