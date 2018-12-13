package fr.orsys.grapheur.graphe.presentation.equation;

import javax.swing.JPanel;

import fr.orsys.grapheur.graphe.Graphe;

/**
 * 
 * @author guehenneux
 * 
 */
public class PanneauEquation extends JPanel {

	/**
	 * UID genere le 24/06/2010
	 */
	private static final long serialVersionUID = 7264800409289202620L;

	protected Graphe graphe;

	/**
	 * @param graphe
	 *            the graphe to set
	 */
	public void setGraphe(Graphe graphe) {
		this.graphe = graphe;
	}

}