package fr.orsys.grapheur.utilitaire.swing;

import java.util.TimerTask;

/**
 * 
 * @author GUEHENNEUX
 * 
 */
public class Rafrachissement extends TimerTask {

	private PanneauTampon panneau;

	/**
	 * @param panneau
	 */
	public Rafrachissement(PanneauTampon panneau) {
		this.panneau = panneau;
	}

	@Override
	public void run() {

		panneau.setImageAJour(false);
		panneau.repaint();

	}

}