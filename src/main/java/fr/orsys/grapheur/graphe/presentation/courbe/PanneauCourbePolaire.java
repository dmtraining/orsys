package fr.orsys.grapheur.graphe.presentation.courbe;

import fr.orsys.grapheur.graphe.courbe.CourbePolaire;
import fr.orsys.grapheur.graphe.equation.EquationPolaire;
import fr.orsys.grapheur.graphe.presentation.equation.PanneauEquationPolaire;

/**
 * 
 * @author guehenneux
 * 
 */
public class PanneauCourbePolaire extends PanneauCourbe {

	/**
	 * UID genere le 24/06/2010
	 */
	private static final long serialVersionUID = -4445314944420280690L;

	/**
	 * 
	 * @param courbePolaire
	 */
	public PanneauCourbePolaire(CourbePolaire courbePolaire) {

		super(courbePolaire);

		EquationPolaire equationPolaire = courbePolaire.getEquationPolaire();

		panneauEquation = new PanneauEquationPolaire(equationPolaire);

		ajouterComposants();

	}

}