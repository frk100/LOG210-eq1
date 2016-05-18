package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import client.CollectionGestionnaires;
import client.Gestionnaire;
import types.AdresseCourriel;
import types.AdresseLieu;

public class TestGestionnaire {

	@Test
	public void test() {
		
		AdresseCourriel adresseCourriel = new AdresseCourriel("test@gmail.com");
		AdresseLieu adresseLieu = new AdresseLieu("testAdresse,testRue,testCodePostal,testVille");
		CollectionGestionnaires collectionGestionnaire = new CollectionGestionnaires();
		
		String testMotDePasse = "testMotDePasse";
		String testCoop = "testCoop";
		
		Gestionnaire gestionnaire = new Gestionnaire(adresseCourriel, testMotDePasse, testCoop, adresseLieu, collectionGestionnaire);
		assertEquals(gestionnaire.getAdresseCourriel(), adresseCourriel);
		assertEquals(gestionnaire.getMotDePasse(), testMotDePasse);
		assertEquals(gestionnaire.getnomCoop(), testCoop);
		assertEquals(gestionnaire.getAdresseLieu(), adresseLieu);
		
		testSetters(gestionnaire);
		
	}
	
	private void testSetters(Gestionnaire gestionnaire){
		String testCoop2 = "testCoop2";
		AdresseCourriel adresseCourriel2 = new AdresseCourriel("test02@gmail.com");
		AdresseLieu adresseLieu2 = new AdresseLieu("test2Adresse,test2Rue,test2CodePostal,test2Ville");
		
		gestionnaire.setNomCoop(testCoop2);
		gestionnaire.setAdresseCourriel(adresseCourriel2);
		gestionnaire.setAdresseLieu(adresseLieu2);
		
		assertEquals(gestionnaire.getAdresseCourriel(), adresseCourriel2);
		assertEquals(gestionnaire.getnomCoop(), testCoop2);
		assertEquals(gestionnaire.getAdresseLieu(), adresseLieu2);
	}
	
}
