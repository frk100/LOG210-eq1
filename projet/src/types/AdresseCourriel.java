package types;

/**
 * Classe de représentation d'une adresse courriel.
 */

public class AdresseCourriel {
	
	/**
	 * Caractères de séparation
	 */
	private String SEPARATEUR_DOM = "@";
	private String SEPARATEUR_EXT = ".";
	
	/**
	 * Détails de l'adresse
	 */
	private String nom;
	private String domaine;
	private String extension;
	
	
	/*
	 * Contructeur
	 */
	public AdresseCourriel(String adresse){		
		setNom(adresse.substring(0, adresse.indexOf(SEPARATEUR_DOM)));
		setDomaine(adresse.substring(adresse.indexOf(SEPARATEUR_DOM) + 1, adresse.indexOf(SEPARATEUR_EXT)));
		setExtension(adresse.substring(adresse.indexOf(SEPARATEUR_EXT) + 1));
	}
	
	/**
	 * Pour l'affichage textuel de l'adresse 
	 */
	public String toString(){
		return nom + SEPARATEUR_DOM + domaine + SEPARATEUR_EXT + extension;
	}
	
	/*
	 * Getters
	 */
	public String getNom(){
		return this.nom;
	}
	
	public String getDomaine(){
		return this.domaine;
	}
	
	public String getExtension(){
		return this.extension;
	}
	
	/*
	 * Setters
	 */
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void setDomaine(String domaine){
		this.domaine = domaine;	
	}
	
	public void setExtension(String extension){
		this.extension = extension;
	}
	
	
	/*
	 * Main de test
	 */
	public static void main(String agrs[]){
		AdresseCourriel ac = new AdresseCourriel("nom@domaine.extension");
		
		System.out.println("Adresse: " + ac);
		System.out.println("nom: "+ ac.getNom());
		System.out.println("domaine: " + ac.getDomaine());
		System.out.println("extension: " + ac.getExtension());
		
	}
}
