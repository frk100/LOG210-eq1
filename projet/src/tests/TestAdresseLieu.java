package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import types.AdresseLieu;

public class TestAdresseLieu {

	@Test
	public void test() {
		String testNumAdresse = "testNumAdresse";
		String testRue = "testRue";
		String testCodePostal = "testCodePostal";
		String testVille = "testVille";
		String testToString = "testNumAdresse testRue testCodePostal testVille";
		
		AdresseLieu adresseLieu = new AdresseLieu(testNumAdresse + "," + testRue + "," + testCodePostal + "," + testVille);
		assertEquals(adresseLieu.getNumAdresse(), testNumAdresse);
		assertEquals(adresseLieu.getRue(), testRue);
		assertEquals(adresseLieu.getCodePostal(), testCodePostal);
		assertEquals(adresseLieu.getVille(), testVille);
		assertEquals(adresseLieu.toString(), testToString);
		
		testSetters(adresseLieu);
	}
	
	private void testSetters(AdresseLieu adresseLieu){
		String testNumAdresse2 = "testNumAdresse2";
		String testRue2 = "testRue2";
		String testCodePostal2 = "testCodePostal2";
		String testVille2 = "testVille2";
		String testToString2 = "testNumAdresse2 testRue2 testCodePostal2 testVille2";
		
		adresseLieu.setNumAdresse(testNumAdresse2);
		adresseLieu.setRue(testRue2);
		adresseLieu.setCodePostal(testCodePostal2);
		adresseLieu.setVille(testVille2);
		
		assertEquals(adresseLieu.getNumAdresse(), testNumAdresse2);
		assertEquals(adresseLieu.getRue(), testRue2);
		assertEquals(adresseLieu.getCodePostal(), testCodePostal2);
		assertEquals(adresseLieu.getVille(), testVille2);
		assertEquals(adresseLieu.toString(), testToString2);
	}

}
