package fr.orsys.grapheur.graphe.fonction;

/**
 * 
 * @author guehenneux
 * 
 */
public class Constante extends FonctionAbstraite {

	private double valeur;

	/**
	 * @param valeur
	 */
	public Constante(double valeur) {
		this.valeur = valeur;
	}

	@Override
	public double evaluer(double x) {
		return valeur;
	}

	@Override
	public String getTexte() {
		return Double.toString(valeur);
	}

}