package fr.orsys.grapheur.utilitaire.couleur;

import java.awt.Color;

/**
 * 
 * @author guehenneux
 * 
 */
public class EspaceRGB extends EspaceColorimetrique {

	private static EspaceRGB instance;

	/**
	 * 
	 * @return
	 */
	public static final synchronized EspaceRGB getInstance() {

		if (instance == null) {
			instance = new EspaceRGB();
		}

		return instance;

	}

	/**
	 * 
	 */
	private EspaceRGB() {
		super("RGB", "Rouge", "Vert", "Bleu");
	}

	@Override
	public Color getCouleur(int composante0, int composante1, int composante2) {
		return new Color(composante0, composante1, composante2);
	}

	@Override
	public int[] getComposantes(Color couleur) {

		return new int[] { couleur.getRed(), couleur.getGreen(),
				couleur.getBlue() };

	}

}