package fr.orsys.grapheur.graphe.presentation.courbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import fr.orsys.grapheur.graphe.Graphe;
import fr.orsys.grapheur.graphe.courbe.Courbe;
import fr.orsys.grapheur.graphe.presentation.equation.PanneauEquation;
import fr.orsys.grapheur.utilitaire.couleur.choix.ChoixCouleur;

/**
 * panneau de parametrage d'une courbe
 * 
 * @author guehenneux
 * 
 */
public abstract class PanneauCourbe extends JPanel {

	/**
	 * UID genere le 23/06/2010
	 */
	private static final long serialVersionUID = 5409727442726658863L;

	private static final String TITRE = "Propriétés de la courbe";
	private static final String TITRE_PARAMETRES_GENERAUX = "Paramètres généraux";
	private static final String TITRE_DOMAINE = "Domaine";
	private static final String TITRE_FONCTION = "Fonction";

	private static final Color COULEUR_LABELS = Color.BLUE;

	private static final ChoixCouleur CHOIX_COULEUR_COURBE = new ChoixCouleur();

	private JPanel panneauParametresGeneraux;
	private JPanel panneauDomaine;
	private JPanel panneauFonctionEncadre;

	private JLabel labelNom;
	private JTextField champNom;

	private JLabel labelType;
	private JLabel champType;

	private JLabel labelCouleur;
	private JButton champCouleur;

	private JLabel labelMin;
	private JTextField champMin;

	private JLabel labelMax;
	private JTextField champMax;

	private JLabel labelPas;
	private JTextField champPas;

	private JLabel labelInterpolee;
	private JCheckBox champInterpolee;

	protected PanneauEquation panneauEquation;

	private Graphe graphe;
	private Courbe courbe;

	/**
	 * 
	 * @param courbe
	 */
	public PanneauCourbe(Courbe courbe) {

		this.courbe = courbe;

		Border bordure = BorderFactory.createTitledBorder(TITRE);

		setBorder(bordure);

		setLayout(new GridBagLayout());

		creerComposants();
		ajouterEcouteurs();

	}

	/**
	 * 
	 */
	private final void creerComposants() {

		/*
		 * parametres generaux
		 */

		labelNom = new JLabel("Nom : ");
		labelNom.setForeground(COULEUR_LABELS);
		String nom = courbe.getNom();
		champNom = new JTextField(20);
		champNom.setText(nom);

		labelType = new JLabel("Type : ");
		labelType.setForeground(COULEUR_LABELS);
		String type = courbe.getType().toString();
		champType = new JLabel(type);

		labelCouleur = new JLabel("Couleur : ");
		labelCouleur.setForeground(COULEUR_LABELS);
		champCouleur = new JButton();
		Dimension tailleBouton = new Dimension(80, 20);
		champCouleur.setPreferredSize(tailleBouton);
		champCouleur.setMinimumSize(tailleBouton);

		actualiserCouleurCourbe();

		panneauParametresGeneraux = new JPanel();
		panneauParametresGeneraux.setLayout(new GridBagLayout());
		panneauParametresGeneraux.setBorder(BorderFactory
				.createTitledBorder(TITRE_PARAMETRES_GENERAUX));

		/*
		 * domaine
		 */

		double min = courbe.getMin();
		labelMin = new JLabel("Minimum : ");
		labelMin.setForeground(COULEUR_LABELS);
		champMin = new JTextField(15);
		champMin.setText(Double.toString(min));

		double max = courbe.getMax();
		labelMax = new JLabel("Maximum : ");
		labelMax.setForeground(COULEUR_LABELS);
		champMax = new JTextField(15);
		champMax.setText(Double.toString(max));

		double pas = courbe.getPas();
		labelPas = new JLabel("Pas : ");
		labelPas.setForeground(COULEUR_LABELS);
		champPas = new JTextField(10);
		champPas.setText(Double.toString(pas));

		boolean interpolee = courbe.isInterpolee();
		labelInterpolee = new JLabel("Interpolation : ");
		labelInterpolee.setForeground(COULEUR_LABELS);
		champInterpolee = new JCheckBox();
		champInterpolee.setSelected(interpolee);

		panneauDomaine = new JPanel();
		panneauDomaine.setLayout(new GridBagLayout());
		panneauDomaine.setBorder(BorderFactory
				.createTitledBorder(TITRE_DOMAINE));

		/*
		 * fonction
		 */

		panneauFonctionEncadre = new JPanel();

		panneauFonctionEncadre.setLayout(new BorderLayout());

		Border bordurePanneauFonction = BorderFactory
				.createTitledBorder(TITRE_FONCTION);

		panneauFonctionEncadre.setBorder(bordurePanneauFonction);

	}

	/**
	 * 
	 */
	protected final void ajouterComposants() {

		GridBagConstraints contraintes = new GridBagConstraints();

		contraintes.anchor = GridBagConstraints.LINE_START;
		contraintes.insets = new Insets(2, 2, 2, 2);

		/*
		 * parametres generaux
		 */

		contraintes.gridx = 0;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauParametresGeneraux.add(labelNom, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauParametresGeneraux.add(champNom, contraintes);

		contraintes.gridx = 0;
		contraintes.gridy = 1;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauParametresGeneraux.add(labelType, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 1;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauParametresGeneraux.add(champType, contraintes);

		contraintes.gridx = 0;
		contraintes.gridy = 2;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauParametresGeneraux.add(labelCouleur, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 2;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauParametresGeneraux.add(champCouleur, contraintes);

		/*
		 * domaine
		 */

		contraintes.gridx = 0;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(labelMin, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(champMin, contraintes);

		contraintes.gridx = 0;
		contraintes.gridy = 1;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(labelMax, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 1;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(champMax, contraintes);

		contraintes.gridx = 0;
		contraintes.gridy = 2;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(labelPas, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 2;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(champPas, contraintes);

		contraintes.gridx = 0;
		contraintes.gridy = 3;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(labelInterpolee, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 3;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		panneauDomaine.add(champInterpolee, contraintes);

		/*
		 * fonction
		 */

		panneauFonctionEncadre.add(panneauEquation, BorderLayout.CENTER);

		/*
		 * panneaux
		 */

		contraintes.gridx = 0;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		add(panneauParametresGeneraux, contraintes);

		contraintes.gridx = 1;
		contraintes.gridy = 0;
		contraintes.gridwidth = 1;
		contraintes.gridheight = 1;
		add(panneauDomaine, contraintes);

		contraintes.gridx = 0;
		contraintes.gridy = 1;
		contraintes.gridwidth = 2;
		contraintes.gridheight = 1;
		contraintes.fill = GridBagConstraints.BOTH;
		add(panneauFonctionEncadre, contraintes);

	}

	/**
	 * 
	 */
	private final void ajouterEcouteurs() {

		champCouleur.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evenement) {

				Color couleurCourbe = courbe.getCouleur();

				try {

					couleurCourbe = CHOIX_COULEUR_COURBE.ouvrirDialogue(
							PanneauCourbe.this, couleurCourbe);

				} catch (InterruptedException erreur) {

				}

				courbe.setCouleur(couleurCourbe);
				graphe.actualiserGraphe();

			}

		});

		champNom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evenement) {

				String nom = champNom.getText();
				courbe.setNom(nom);
				graphe.actualiserListeCourbes();

			}

		});

		champMin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evenement) {

				double min = Double.parseDouble(champMin.getText());
				courbe.setMin(min);
				graphe.actualiserGraphe();

			}

		});

		champMax.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evenement) {

				double max = Double.parseDouble(champMax.getText());
				courbe.setMax(max);
				graphe.actualiserGraphe();

			}

		});

		champPas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evenement) {

				double pas = Double.parseDouble(champPas.getText());
				courbe.setPas(pas);
				graphe.actualiserGraphe();

			}

		});

		champInterpolee.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent evenement) {

				boolean interpolee = champInterpolee.isSelected();
				courbe.setInterpolee(interpolee);
				graphe.actualiserGraphe();

			}

		});

	}

	/**
	 * 
	 */
	public final void actualiserCouleurCourbe() {

		Color couleurCourbe = courbe.getCouleur();
		champCouleur.setBackground(couleurCourbe);

	}

	/**
	 * @param graphe
	 *            the graphe to set
	 */
	public void setGraphe(Graphe graphe) {

		this.graphe = graphe;
		panneauEquation.setGraphe(graphe);

	}

}