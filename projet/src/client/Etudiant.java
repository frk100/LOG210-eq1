package client;

import types.AdresseCourriel;

public class Etudiant extends Client{

	public Etudiant(AdresseCourriel adresseCourriel, String motDePasse, CollectionEtudiants collection){
		super(adresseCourriel, motDePasse, collection);
		collection.add(this);
	}
}
