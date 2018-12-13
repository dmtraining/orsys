package fr.orsys.grapheur.graphe.equation;

import fr.orsys.grapheur.graphe.fonction.Fonction;

/**
 * equation du type y = f(x)
 * 
 * @author guehenneux
 * 
 */
public class EquationCartesienne implements Equation {

	private Fonction f;

	/**
	 * @param f
	 */
	public EquationCartesienne(Fonction f) {
		this.f = f;
	}

	/**
	 * @return the f
	 */
	public Fonction getF() {
		return f;
	}

	/**
	 * @param f
	 *            the f to set
	 */
	public void setF(Fonction f) {
		this.f = f;
	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public final double getY(double x) {
		return f.evaluer(x);
	}

}