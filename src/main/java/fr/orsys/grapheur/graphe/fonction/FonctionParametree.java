package fr.orsys.grapheur.graphe.fonction;

/**
 * 
 * @author guehenneux
 * 
 */
public abstract class FonctionParametree extends FonctionAbstraite {

	private static final String SEPARATEUR_PARAMETRES = ", ";

	protected Fonction[] sousFonctions;
	protected double[] parametres;
	private int arite;

	/**
	 * 
	 * @param sousFonctions
	 */
	public FonctionParametree(Fonction... sousFonctions) {

		this.sousFonctions = sousFonctions;

		arite = sousFonctions.length;
		parametres = new double[arite];

	}

	@Override
	public final double evaluer(double x) {

		Fonction sousFonction;

		for (int indexSousFonction = 0; indexSousFonction < arite; indexSousFonction++) {

			sousFonction = sousFonctions[indexSousFonction];
			parametres[indexSousFonction] = sousFonction.evaluer(x);

		}

		return evaluer();

	}

	/**
	 * 
	 * @return
	 */
	public abstract double evaluer();

	/**
	 * 
	 * @return
	 */
	protected final String getTexteSousFonctions() {

		StringBuilder fabriqueTexte = new StringBuilder();

		boolean separateur = false;

		for (Fonction sousFonction : sousFonctions) {

			if (separateur) {
				fabriqueTexte.append(SEPARATEUR_PARAMETRES);
			} else {
				separateur = true;
			}

			fabriqueTexte.append(sousFonction.getTexte());

		}

		return fabriqueTexte.toString();

	}

}