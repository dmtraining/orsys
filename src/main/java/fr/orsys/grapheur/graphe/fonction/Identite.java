package fr.orsys.grapheur.graphe.fonction;

/**
 * 
 * @author guehenneux
 * 
 */
public class Identite extends FonctionAbstraite {

	private String nomVariable;

	/**
	 * @param nomVariable
	 */
	public Identite(String nomVariable) {
		this.nomVariable = nomVariable;
	}

	@Override
	public double evaluer(double x) {
		return x;
	}

	@Override
	public String getTexte() {
		return nomVariable;
	}

}