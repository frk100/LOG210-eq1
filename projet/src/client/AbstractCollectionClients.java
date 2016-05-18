package client;

import java.util.ArrayList;

public abstract class AbstractCollectionClients extends ArrayList<Client>{
	
	public AbstractCollectionClients(){
		
	}

	@Override
	public boolean add(Client client){
		for(Client c : this){
			if(c.getAdresseCourriel().toString().equals(client.getAdresseCourriel().toString())){
				System.out.println("Adresse courriel déjà existante.");
				return false;
			}
		}
		super.add(client);
		return true;
	}
}
