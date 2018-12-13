package fr.orsys.grapheur.graphe.presentation.courbe;

import fr.orsys.grapheur.graphe.courbe.CourbeParametrique;
import fr.orsys.grapheur.graphe.equation.EquationParametrique;
import fr.orsys.grapheur.graphe.presentation.equation.PanneauEquationParametrique;

/**
 * 
 * @author guehenneux
 * 
 */
public class PanneauCourbeParametrique extends PanneauCourbe {

	/**
	 * UID genere le 24/06/2010
	 */
	private static final long serialVersionUID = -8565289176312901406L;

	/**
	 * 
	 * @param courbeParametrique
	 */
	public PanneauCourbeParametrique(CourbeParametrique courbeParametrique) {

		super(courbeParametrique);

		EquationParametrique equationParametrique = courbeParametrique
				.getEquationParametrique();

		panneauEquation = new PanneauEquationParametrique(equationParametrique);

		ajouterComposants();

	}

}