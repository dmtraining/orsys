package fr.orsys.grapheur.graphe.presentation.courbe;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import fr.orsys.grapheur.graphe.courbe.Courbe;

/**
 * 
 * @author guehenneux
 * 
 */
public class RenduListeCourbes implements ListCellRenderer {

private static final DefaultListCellRenderer RENDU_DEFAUT = new DefaultListCellRenderer();

/**
* la largeur est donnee par la liste contenant la cellule
*/
private static final Dimension DIMENSION_OPTIMALE = new Dimension(0, 20);

private static RenduListeCourbes instance;

/**
*
* @return
*/
public static synchronized RenduListeCourbes getInstance() {

if (instance == null) {
instance = new RenduListeCourbes();
}

return instance;

}

/**
* constructeur prive pour appliquer le patron de conception Singleton
*/
private RenduListeCourbes() {

}

@Override
public Component getListCellRendererComponent(
JList courbes, Object courbe, int indexCourbe,
boolean courbeSelectionnee, boolean focus) {

JLabel cellule = (JLabel) RENDU_DEFAUT.getListCellRendererComponent(
courbes, courbe, indexCourbe, courbeSelectionnee, focus);

if (courbe != null) {

cellule.setForeground(((Courbe) courbe).getCouleur());
cellule.setPreferredSize(DIMENSION_OPTIMALE);

}

return cellule;

}

}