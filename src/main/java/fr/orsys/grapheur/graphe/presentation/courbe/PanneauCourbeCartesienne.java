package fr.orsys.grapheur.graphe.presentation.courbe;

import fr.orsys.grapheur.graphe.courbe.CourbeCartesienne;
import fr.orsys.grapheur.graphe.equation.EquationCartesienne;
import fr.orsys.grapheur.graphe.presentation.equation.PanneauEquationCartesienne;

/**
 * 
 * @author guehenneux
 * 
 */
public class PanneauCourbeCartesienne extends PanneauCourbe {

	/**
	 * UID genere le 23/06/2010
	 */
	private static final long serialVersionUID = 2310875114550872630L;

	/**
	 * 
	 * @param courbeCartesienne
	 */
	public PanneauCourbeCartesienne(CourbeCartesienne courbeCartesienne) {

		super(courbeCartesienne);

		EquationCartesienne equationCartesienne = courbeCartesienne
				.getEquationCartesienne();

		panneauEquation = new PanneauEquationCartesienne(equationCartesienne);

		ajouterComposants();

	}

}