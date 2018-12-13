package fr.orsys.grapheur.utilitaire.swing;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

/**
 * 
 * @author guehenneux
 * 
 */
public class SwingUtilitaire {

	/**
	 * 
	 * @param imageSource
	 * @return
	 */
	public static final BufferedImage copier(BufferedImage source) {

		WritableRaster raster = source.copyData(null);

		BufferedImage copie = new BufferedImage(source.getColorModel(), raster,
				source.isAlphaPremultiplied(), null);

		return copie;

	}

}