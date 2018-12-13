package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Pow extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 * @param exposant
	 */
	public Pow(Fonction sousFonction, Fonction exposant) {
		super(sousFonction, exposant);
	}

	@Override
	public double evaluer() {
		return Math.pow(parametres[0], parametres[1]);
	}

	@Override
	public String getTexte() {
		return "pow(" + getTexteSousFonctions() + ")";
	}

}