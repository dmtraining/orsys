package fr.orsys.grapheur.utilitaire.couleur.choix;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import fr.orsys.grapheur.utilitaire.couleur.EspaceColorimetrique;

/**
 * 
 * @author guehenneux
 * 
 */
public class EcouteurChangementEspaceColorimetrique implements ActionListener {

	private ChoixCouleur choixCouleur;
	private JComboBox combo;

	/**
	 * @param choixCouleur
	 * @param combo
	 */
	public EcouteurChangementEspaceColorimetrique(ChoixCouleur choixCouleur,
			JComboBox combo) {

		this.choixCouleur = choixCouleur;
		this.combo = combo;

		combo.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent evenement) {

		EspaceColorimetrique espaceColorimetrique = (EspaceColorimetrique) combo
				.getSelectedItem();

		choixCouleur.setEspaceColorimetrique(espaceColorimetrique);

	}

}