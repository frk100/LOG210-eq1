package client;

import types.AdresseCourriel;
import types.AdresseLieu;

public class Gestionnaire extends Client {
	
	private String nomCoop;
	private AdresseLieu adresseCoop;
	
	public Gestionnaire (AdresseCourriel adresseCourriel,String motDePasse,String nomCoop ,AdresseLieu adresseCoop, CollectionGestionnaires collection)
	{
		super(adresseCourriel, motDePasse, collection);
		setNomCoop(nomCoop);
		setAdresseLieu(adresseCoop);
		collection.add(this);
	}
	
	/*
	 * Setters
	 */
	public void setNomCoop(String nomCoop)
	{
		this.nomCoop=nomCoop;
	}
	
	public void setAdresseLieu(AdresseLieu adresseCoop)
	{
		this.adresseCoop=adresseCoop;
	}
	
	/*
	 * Getters
	 */
	public String getnomCoop()
	{
		return nomCoop;
	}	
	public AdresseLieu getAdresseLieu()
	{
		return adresseCoop;
	}
	
	

}
