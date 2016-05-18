package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import client.CollectionGestionnaires;
import client.Gestionnaire;

public class TestCollectionGestionnaire {

	@Test
	public void test() {
		CollectionGestionnaires collection = new CollectionGestionnaires();
		
		Gestionnaire gestionnaire1 = new Gestionnaire(null, null, null, null, collection);
		Gestionnaire gestionnaire2 = new Gestionnaire(null, null, null, null, collection);
		Gestionnaire gestionnaire3 = new Gestionnaire(null, null, null, null, collection);
		Gestionnaire gestionnaire4 = new Gestionnaire(null, null, null, null, collection);
		Gestionnaire gestionnaire5 = new Gestionnaire(null, null, null, null, collection);
		
		assertEquals(collection.get(0), gestionnaire1);
		assertEquals(collection.get(1), gestionnaire2);
		assertEquals(collection.get(2), gestionnaire3);
		assertEquals(collection.get(3), gestionnaire4);
		assertEquals(collection.get(4), gestionnaire5);
	}

}
