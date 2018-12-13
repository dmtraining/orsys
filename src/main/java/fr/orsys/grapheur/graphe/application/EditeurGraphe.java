package fr.orsys.grapheur.graphe.application;

import fr.orsys.grapheur.graphe.Graphe;
import fr.orsys.grapheur.utilitaire.GestionnaireException;
import fr.orsys.grapheur.utilitaire.apparence.LookAndFeelUtilitaire;
import fr.orsys.grapheur.utilitaire.swing.FenetreApplication;

/**
 * lancement de l'application en mode fenetre : edition et visualisation de
 * courbes sur un graphe
 * 
 * @author guehenneux
 * 
 */
public class EditeurGraphe {

	/**
	 * 
	 * @param arguments
	 *            inutiles
	 */
	public static void main(String... arguments) {

		try {
			LookAndFeelUtilitaire.setLookAndFeelParNom("Nimbus");
		} catch (Exception erreur) {
			GestionnaireException.traiter(erreur);
		}

		Graphe graphe = new Graphe();
		new FenetreApplication(graphe.getPresentation());

	}

}