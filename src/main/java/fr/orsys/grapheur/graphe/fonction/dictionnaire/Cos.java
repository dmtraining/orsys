package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Cos extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Cos(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.cos(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "cos(" + getTexteSousFonctions() + ")";
	}

}