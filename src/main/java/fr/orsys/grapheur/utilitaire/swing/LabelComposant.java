package fr.orsys.grapheur.utilitaire.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author guehenneux
 * 
 */
public class LabelComposant extends JPanel {

	/**
	 * UID genere le 17/06/2010
	 */
	private static final long serialVersionUID = 770303448270197269L;

	private JLabel label;
	private Component composant;

	/**
	 * 
	 * @param label
	 * @param composant
	 */
	public LabelComposant(String label, Component composant) {

		setLayout(new BorderLayout());

		this.label = new JLabel(label);
		this.composant = composant;

		add(this.label, BorderLayout.WEST);
		add(composant, BorderLayout.CENTER);

	}

	/**
	 * 
	 * @param label
	 */
	public void setLabel(String label) {
		this.label.setText(label);
	}

	/**
	 * 
	 * @param foreground
	 */
	public void setForegroundLabel(Color foreground) {
		label.setForeground(foreground);
	}

	/**
	 * 
	 * @param foreground
	 */
	public void setForegroundComposant(Color foreground) {
		composant.setForeground(foreground);
	}

	@Override
	public void setForeground(Color foreground) {

		if (label != null) {
			label.setForeground(foreground);
		}

		if (composant != null) {
			composant.setForeground(foreground);
		}

	}

}