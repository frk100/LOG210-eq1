package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import client.CollectionEtudiants;
import client.Etudiant;
import types.AdresseCourriel;

public class TestEtudiant {

	@Test
	public void test() {
		String MotDePasseTest = "MotDePasseTest";
		CollectionEtudiants collection = new CollectionEtudiants();
		AdresseCourriel adresse = new AdresseCourriel("test@gmail.com");
		
		Etudiant etudiant = new Etudiant(adresse, MotDePasseTest, collection);
		assertEquals(etudiant.getAdresseCourriel(), adresse);
		assertEquals(etudiant.getMotDePasse(), MotDePasseTest);
		assertEquals(collection.get(0), etudiant);
		
		testSetters(etudiant);
	}
	
	private void testSetters(Etudiant etudiant){
		AdresseCourriel adresse2 = new AdresseCourriel("test02@gmail.com");
		etudiant.setAdresseCourriel(adresse2);
		assertEquals(etudiant.getAdresseCourriel(), adresse2);
	}

}
