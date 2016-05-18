package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import client.CollectionEtudiants;
import client.CollectionGestionnaires;
import client.Etudiant;
import client.Gestionnaire;
import types.AdresseCourriel;
import types.AdresseLieu;

public class GUI extends JFrame{
	
	private final Dimension DIMENSION_DEFAUT = new Dimension(600,600);
	
	private JLabel labelAdresseCourriel = new JLabel("Adresse courriel [nom@domaine.extension]: ");
	private JLabel labelMotDePasse = new JLabel("Mot de passe: ");
	private JLabel labelConfirmationMotDePasse = new JLabel("Confirmation mot de passe: ");
	private JLabel labelNomCoop = new JLabel("Nom coop: ");
	private JLabel labelAdresseCoop = new JLabel("Adresse coop [#,rue,code postal,ville]: ");
	
	private final int LARGEUR_TEXTFIELD = 50;
	private JTextField textFieldAdresseCourriel = new JTextField(LARGEUR_TEXTFIELD);
	private JTextField textFieldMotDePasse = new JTextField(LARGEUR_TEXTFIELD);
	private JTextField textFieldConfirmationMotDePasse = new JTextField(LARGEUR_TEXTFIELD);
	private JTextField textFieldNomCoop = new JTextField(LARGEUR_TEXTFIELD);
	private JTextField textFieldAdresseCoop = new JTextField(LARGEUR_TEXTFIELD);
	
	private Button buttonConfirmer = new Button("Confirmer");
	
	CollectionGestionnaires collectionGestionnaires = new CollectionGestionnaires();
	CollectionEtudiants collectionEtudiants = new CollectionEtudiants();
	
	public GUI(String titre){
		super(titre);
		this.setSize(DIMENSION_DEFAUT);
		
		
		JPanel panelChamps = new JPanel();
		
		panelChamps.setLayout(new BoxLayout(panelChamps, BoxLayout.PAGE_AXIS));
		
		JPanel panelAdresseCourriel = new JPanel();
		panelAdresseCourriel.setLayout(new FlowLayout());
		panelAdresseCourriel.add(labelAdresseCourriel);
		panelAdresseCourriel.add(textFieldAdresseCourriel);
		
		JPanel panelMotDePasse = new JPanel();
		panelMotDePasse.setLayout(new FlowLayout());
		panelMotDePasse.add(labelMotDePasse);
		panelMotDePasse.add(textFieldMotDePasse);
		
		JPanel panelConfirmationMotDePasse = new JPanel();
		panelConfirmationMotDePasse.setLayout(new FlowLayout());
		panelConfirmationMotDePasse.add(labelConfirmationMotDePasse);
		panelConfirmationMotDePasse.add(textFieldConfirmationMotDePasse);
		
		JPanel panelNomCoop = new JPanel();
		panelNomCoop.setLayout(new FlowLayout());
		panelNomCoop.add(labelNomCoop);
		panelNomCoop.add(textFieldNomCoop);
		
		JPanel panelAdresseCoop = new JPanel();
		panelAdresseCoop.setLayout(new FlowLayout());
		panelAdresseCoop.add(labelAdresseCoop);
		panelAdresseCoop.add(textFieldAdresseCoop);
		
		buttonConfirmer.setBackground(Color.CYAN);
		buttonConfirmer.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(textFieldNomCoop.getText().trim().equals("") && 
					textFieldAdresseCoop.getText().trim().equals("")){
					if(champsEtudiantsRemplis()){
						//Création d'un compte étudiant
						if(textFieldMotDePasse.getText().equals(textFieldConfirmationMotDePasse.getText())){
							Etudiant nouvelEtudiant = new Etudiant(new AdresseCourriel(textFieldAdresseCourriel.getText()),
									textFieldMotDePasse.getText(), 
									collectionEtudiants);
						}
						else{
							JOptionPane.showMessageDialog(buttonConfirmer.getParent(), "Les mots de passe ne concordent pas.");
						}
					}
					else{
						JOptionPane.showMessageDialog(buttonConfirmer.getParent(), "Veuillez entrer une adresse courriel et un mot de passe pour créer un compte étudiant.");
					}
						
				}
				else{
					//Création d'un compte gestionnaire
					if(chaqueChampRempli()){
						if(textFieldMotDePasse.getText().equals(textFieldConfirmationMotDePasse.getText())){
							Gestionnaire nouvelEtudiant = new Gestionnaire(new AdresseCourriel(textFieldAdresseCourriel.getText()),
																	textFieldMotDePasse.getText(),
																	textFieldNomCoop.getText(),
																	new AdresseLieu(textFieldAdresseCoop.getText()),
																	collectionGestionnaires);
						}
						else{
							JOptionPane.showMessageDialog(buttonConfirmer.getParent(), "Les mots de passe ne concordent pas.");
						}
						
					}
					else{
						JOptionPane.showMessageDialog(buttonConfirmer.getParent(), "Veuillez remplir tous les champs pour créer un compte gestionnaire.");
					}
				}
				System.out.println("Etudiants: " + collectionEtudiants);
				System.out.println("Gestionnaires: " + collectionGestionnaires);
			}
			
		});
		
		panelChamps.add(panelAdresseCourriel);
		panelChamps.add(panelMotDePasse);
		panelChamps.add(panelConfirmationMotDePasse);
		panelChamps.add(panelNomCoop);
		panelChamps.add(panelAdresseCoop);
		panelChamps.add(buttonConfirmer);
		
		this.add(panelChamps);
		
		this.setVisible(true);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private boolean champsEtudiantsRemplis(){
		return !textFieldAdresseCourriel.getText().trim().equals("") &&
				!textFieldMotDePasse.getText().trim().equals("") &&
				!textFieldConfirmationMotDePasse.getText().trim().equals("");
	}
	
	private boolean chaqueChampRempli(){
		return champsEtudiantsRemplis() &&
				!textFieldNomCoop.getText().equals("") &&
				!textFieldAdresseCoop.getText().equals("");
				
	}
	
	public static void main(String args[]){
		GUI gui = new GUI("GUI DEMO");
	}

}
