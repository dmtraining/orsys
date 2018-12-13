package fr.orsys.grapheur.graphe.fonction;

/**
 * 
 * @author guehenneux
 * 
 */
public interface Fonction {

	/**
	 * 
	 * @param x
	 * @return
	 */
	public abstract double evaluer(double x);

	/**
	 * 
	 * @return
	 */
	public abstract String getTexte();
	
}