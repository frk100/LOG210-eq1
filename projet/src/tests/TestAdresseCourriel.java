package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import types.AdresseCourriel;

public class TestAdresseCourriel {

	@Test
	public void test() {
		
		String testNom = "testNom";
		String testDomaine = "testDomaine";
		String testExtension = "testExtension";
		String testToString = "testNom@testDomaine.testExtension";
		
		AdresseCourriel adresse = new AdresseCourriel(testNom + "@" + testDomaine + "." + testExtension);
		assertEquals(adresse.getNom(), testNom);
		assertEquals(adresse.getDomaine(), testDomaine);
		assertEquals(adresse.getExtension(), testExtension);
		assertEquals(adresse.toString(), testToString);
		
		testSetters(adresse);
	}
	
	private void testSetters(AdresseCourriel adresse){
		String testNom2 = "testNom2";
		String testDomaine2 = "testDomaine2";
		String testExtension2 = "testExtension2";
		String testToString2 = "testNom2@testDomaine2.testExtension2";

		adresse.setNom(testNom2);
		adresse.setDomaine(testDomaine2);
		adresse.setExtension(testExtension2);
		
		assertEquals(adresse.getNom(), testNom2);
		assertEquals(adresse.getDomaine(), testDomaine2);
		assertEquals(adresse.getExtension(), testExtension2);
		assertEquals(adresse.toString(), testToString2);
	}

}         
