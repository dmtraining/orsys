package fr.orsys.grapheur.graphe.presentation.equation;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import fr.orsys.grapheur.graphe.equation.EquationPolaire;
import fr.orsys.grapheur.graphe.fonction.Fonction;
import fr.orsys.grapheur.graphe.fonction.fabrique.FabriqueFonction;
import fr.orsys.grapheur.graphe.grammaire.ErreurSyntaxe;
import fr.orsys.grapheur.utilitaire.GestionnaireException;

/**
 * 
 * @author guehenneux
 * 
 */
public class PanneauEquationPolaire extends PanneauEquation {

	/**
	 * UID genere le 24/06/2010
	 */
	private static final long serialVersionUID = -5646247623807571642L;

	private JLabel labelF;
	private JTextField champF;

	private EquationPolaire equationPolaire;

	/**
	 * @param equationPolaire
	 */
	public PanneauEquationPolaire(EquationPolaire equationPolaire) {

		this.equationPolaire = equationPolaire;

		setLayout(new GridBagLayout());

		creerComposants();
		ajouterComposants();
		ajouterEcouteurs();

	}

	/**
	 * 
	 */
	private final void creerComposants() {

		labelF = new JLabel("r = f(t) = ");

		Fonction f = equationPolaire.getF();

		champF = new JTextField(50);
		champF.setText(f.getTexte());

	}

	/**
	 * 
	 */
	private final void ajouterComposants() {

		GridBagConstraints contraintes = new GridBagConstraints();
		contraintes.insets = new Insets(2, 2, 2, 2);
		
		contraintes.gridx = 0;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		add(labelF, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		add(champF, contraintes);

	}

	/**
	 * 
	 */
	private final void ajouterEcouteurs() {

		champF.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evenement) {

				try {

					String texteF = champF.getText();

					Fonction f = FabriqueFonction.getInstance().creerFonction(
							texteF);

					equationPolaire.setF(f);
					graphe.actualiserGraphe();

				} catch (ErreurSyntaxe erreurSyntaxe) {

					GestionnaireException.traiter(erreurSyntaxe);

				}

			}

		});

	}

}