package fr.orsys.grapheur.graphe.equation;

import fr.orsys.grapheur.graphe.fonction.Fonction;

/**
 * equation du type rho = f(theta)
 * 
 * @author guehenneux
 * 
 */
public class EquationPolaire implements Equation {

	private Fonction f;

	/**
	 * @param f
	 */
	public EquationPolaire(Fonction f) {
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
	 * @param theta
	 * @return
	 */
	public double getRho(double theta) {
		return f.evaluer(theta);
	}

}