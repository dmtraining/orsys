package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Sin extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Sin(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.sin(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "sin(" + getTexteSousFonctions() + ")";
	}

}