package client;

import types.AdresseCourriel;

public abstract class Client {
	
	private AdresseCourriel adresseCourriel;
	private String motDePasse;
	
	/*
	 * Constructeur
	 */
	public Client(AdresseCourriel adresseCourriel, String motDePasse, AbstractCollectionClients collection){
		setAdresseCourriel(adresseCourriel);
		setMotDePasse(motDePasse);
	}
	
	
	/*
	 * Getters
	 */
	public AdresseCourriel getAdresseCourriel(){
		return this.adresseCourriel;
	}
	
	public String getMotDePasse(){
		return this.motDePasse;
	}
	
	/*
	 * Setters
	 */
	public void setAdresseCourriel(AdresseCourriel adresseCourriel){
		this.adresseCourriel = adresseCourriel;
	}
	
	private void setMotDePasse(String motDePasse){
		this.motDePasse = motDePasse;
	}
}
