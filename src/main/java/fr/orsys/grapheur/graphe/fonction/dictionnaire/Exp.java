package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Exp extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Exp(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.exp(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "exp(" + getTexteSousFonctions() + ")";
	}

}