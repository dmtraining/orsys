package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Tan extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Tan(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.tan(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "tan(" + getTexteSousFonctions() + ")";
	}

}