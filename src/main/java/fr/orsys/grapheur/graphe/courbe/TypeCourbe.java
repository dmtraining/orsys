package fr.orsys.grapheur.graphe.courbe;

import fr.orsys.grapheur.graphe.equation.EquationCartesienne;
import fr.orsys.grapheur.graphe.equation.EquationParametrique;
import fr.orsys.grapheur.graphe.equation.EquationPolaire;
import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.fabrique.FabriqueFonction;
import fr.orsys.grapheur.graphe.grammaire.ErreurSyntaxe;

/**
 * type de courbe
 * 
 * @author guehenneux
 * 
 */
public enum TypeCourbe {

	CARTESIENNE("Cartésienne") {

		@Override
		public Courbe getCourbeDefaut() {

			try {

				Fonction f = FabriqueFonction.getInstance().creerFonction("0");

				EquationCartesienne equationCartesienne = new EquationCartesienne(
						f);

				CourbeCartesienne courbeCartesienne = new CourbeCartesienne(
						NOM_COURBE_DEFAUT, equationCartesienne);

				return courbeCartesienne;

			} catch (ErreurSyntaxe erreur) {

				/*
				 * la fonction par defaut est invalide syntaxiquement
				 */

				return null;

			}

		}

	},

	POLAIRE("Polaire") {

		@Override
		public Courbe getCourbeDefaut() {

			try {

				Fonction f = FabriqueFonction.getInstance().creerFonction("0");

				EquationPolaire equationPolaire = new EquationPolaire(f);

				CourbePolaire courbePolaire = new CourbePolaire(
						NOM_COURBE_DEFAUT, equationPolaire);

				return courbePolaire;

			} catch (ErreurSyntaxe erreur) {

				/*
				 * la fonction par defaut est invalide syntaxiquement
				 */

				return null;

			}

		}

	},

	PARAMETRIQUE("Paramétrique") {

		@Override
		public Courbe getCourbeDefaut() {

			try {

				Fonction f = FabriqueFonction.getInstance().creerFonction("0");
				Fonction g = FabriqueFonction.getInstance().creerFonction("0");

				EquationParametrique equationParametrique = new EquationParametrique(
						f, g);

				CourbeParametrique courbeParametrique = new CourbeParametrique(
						NOM_COURBE_DEFAUT, equationParametrique);

				return courbeParametrique;

			} catch (ErreurSyntaxe erreur) {

				/*
				 * la fonction par defaut est invalide syntaxiquement
				 */

				return null;

			}

		}

	};

	private static final String NOM_COURBE_DEFAUT = "courbe_defaut";

	private String libelle;

	/**
	 * 
	 * @param libelle
	 */
	private TypeCourbe(String libelle) {

		this.libelle = libelle;

	}

	public abstract Courbe getCourbeDefaut();

	@Override
	public String toString() {
		return libelle;
	}

}