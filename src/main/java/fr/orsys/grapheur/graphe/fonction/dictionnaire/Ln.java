package fr.orsys.grapheur.graphe.fonction.dictionnaire;

import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.FonctionParametree;

/**
 * 
 * @author guehenneux
 * 
 */
public class Ln extends FonctionParametree {

	/**
	 * 
	 * @param sousFonction
	 */
	public Ln(Fonction sousFonction) {
		super(sousFonction);
	}

	@Override
	public double evaluer() {
		return Math.log(parametres[0]);
	}

	@Override
	public String getTexte() {
		return "ln(" + getTexteSousFonctions() + ")";
	}

}