package fr.orsys.grapheur.graphe.courbe;

import java.awt.Color;
import java.awt.Shape;

import fr.orsys.grapheur.graphe.equation.Equation;
import fr.orsys.grapheur.graphe.presentation.courbe.PanneauCourbe;

/**
 * interface definissant une courbe
 * 
 * @author guehenneux
 * 
 */
public interface Courbe {

	/**
	 * 
	 * @return l'equation de la courbe
	 */
	public abstract Equation getEquation();

	/**
	 * 
	 * @return la couleur de la courbe
	 */
	public abstract Color getCouleur();

	/**
	 * 
	 * @param couleur
	 *            la couleur de la courbe
	 */
	public abstract void setCouleur(Color couleur);

	/**
	 * 
	 * @return la forme de la courbe
	 */
	public abstract Shape getForme();

	/**
	 * @return le minimum du domaine de definition de la courbe
	 */
	public abstract double getMin();

	/**
	 * @param min
	 *            le minimum du domaine de definition de la courbe
	 */
	public abstract void setMin(double min);

	/**
	 * @return le maximum du domaine de definition de la courbe
	 */
	public abstract double getMax();

	/**
	 * @param max
	 *            le maximum du domaine de definition de la courbe
	 */
	public abstract void setMax(double max);

	/**
	 * @return le pas de dessin de la courbe (l'ecart entre 2 valeurs prises
	 *         dans le domaine de definition)
	 */
	public abstract double getPas();

	/**
	 * @param pas
	 *            le pas de dessin de la courbe (l'ecart entre 2 valeurs prises
	 *            dans le domaine de definition)
	 */
	public abstract void setPas(double pas);

	/**
	 * 
	 * @param interpolee
	 *            true si la courbe est interpolee (un segment est tracee d'un
	 *            point de la courbe au suivant), false sinon
	 */
	public abstract void setInterpolee(boolean interpolee);

	/**
	 * 
	 * @return true si la courbe est interpolee (un segment est tracee d'un
	 *         point de la courbe au suivant), false sinon
	 */
	public abstract boolean isInterpolee();

	/**
	 * 
	 * @return le nom de la courbe
	 */
	public abstract String getNom();

	/**
	 * 
	 * @param nom
	 *            le nom de la courbe
	 */
	public abstract void setNom(String nom);

	/**
	 * 
	 * @return le type de la courbe
	 */
	public abstract TypeCourbe getType();

	/**
	 * 
	 * @return la presentation de la courbe (panneau de parametrage)
	 */
	public abstract PanneauCourbe getPresentation();

}