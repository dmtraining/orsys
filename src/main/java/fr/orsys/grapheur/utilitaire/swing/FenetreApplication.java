package fr.orsys.grapheur.utilitaire.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

/**
 * @author GUEHENNEUX
 */
public class FenetreApplication extends JFrame {

	/**
	 * UID genere le 22/04/2010
	 */
	private static final long serialVersionUID = -7904338443275082054L;

	/**
	 * @param composant
	 */
	public FenetreApplication(Component composant) {
		this(composant, "Editeur de courbes");
	}

	/**
	 * 
	 * @param composant
	 * @param titre
	 */
	public FenetreApplication(Component composant, String titre) {

		super(titre);

		if (composant instanceof Container) {

			setContentPane((Container) composant);

		} else {

			setLayout(new BorderLayout());
			add(composant, BorderLayout.CENTER);

		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}

}