package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Ch extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Ch(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.cosh(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "ch(" + getTexteSousFonctions() + ")";
	}

}