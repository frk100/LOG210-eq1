package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import client.CollectionEtudiants;
import client.Etudiant;

public class TestCollectionEtudiants {

	@Test
	public void test() {
		CollectionEtudiants collection = new CollectionEtudiants();
		
		Etudiant etudiant1 = new Etudiant(null, null, collection);
		Etudiant etudiant2 = new Etudiant(null, null, collection);
		Etudiant etudiant3 = new Etudiant(null, null, collection);
		Etudiant etudiant4 = new Etudiant(null, null, collection);
		Etudiant etudiant5 = new Etudiant(null, null, collection);
		
		assertEquals(collection.get(0), etudiant1);
		assertEquals(collection.get(1), etudiant2);
		assertEquals(collection.get(2), etudiant3);
		assertEquals(collection.get(3), etudiant4);
		assertEquals(collection.get(4), etudiant5);
	}

}
