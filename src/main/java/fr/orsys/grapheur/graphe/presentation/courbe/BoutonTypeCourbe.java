package fr.orsys.grapheur.graphe.presentation.courbe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

import fr.orsys.grapheur.graphe.courbe.Courbe;
import fr.orsys.grapheur.graphe.courbe.TypeCourbe;

/**
 * 
 * @author guehenneux
 * 
 */
public class BoutonTypeCourbe extends JRadioButton {

	/**
	 * UID genere le 24/06/2010
	 */
	private static final long serialVersionUID = -1172449699662066912L;

	private TypeCourbe typeCourbe;

	private PresentationNouvelleCourbe presentationNouvelleCourbe;

	/**
	 * 
	 * @param presentationNouvelleCourbe
	 * @param typeCourbe
	 */
	public BoutonTypeCourbe(
			PresentationNouvelleCourbe presentationNouvelleCourbe,
			TypeCourbe typeCourbe) {

		super(typeCourbe.toString());

		this.presentationNouvelleCourbe = presentationNouvelleCourbe;
		this.typeCourbe = typeCourbe;

		addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evenement) {
				selectionner();
			}

		});

	}

	/**
	 * 
	 */
	private final void selectionner() {
		presentationNouvelleCourbe.setTypeCourbeSelectionne(typeCourbe);
	}

	/**
	 * 
	 * @return
	 */
	public Courbe getCourbe() {
		return typeCourbe.getCourbeDefaut();
	}

}