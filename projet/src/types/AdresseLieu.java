package types;

import javax.swing.JOptionPane;

public class AdresseLieu {
	
	private String rue; 
	private String numAdresse;
	private String codePostal; 
	private String ville;
	private final String SEPARATEUR = ",";
	
	public AdresseLieu(String Lieu)
	{
		if(Lieu.matches("([a-zA-Z0-9]+,[a-zA-Z0-9]+,[a-zA-Z][0-9][a-zA-Z][0-9][a-zA-Z][0-9],[a-zA-Z0-9]+)")){
			String[] details = Lieu.split(SEPARATEUR);
			
			setNumAdresse(details[0]);
			setRue(details[1]);
			setCodePostal(details[2]);
			setVille(details[3]);
		}
		else{
			JOptionPane.showMessageDialog(null, "Adresse de coop invalide.");
		}
	}
	
	public String toString(){
		return getNumAdresse() + ' ' + getRue() + ' ' + getCodePostal() + ' ' + getVille();
	}

	/*
	 * Getters
	 */
	public String getRue()
	{
		return this.rue;
	}
	
	public String getNumAdresse()
	{
		return this.numAdresse;
	}
	
	public String getCodePostal()
	{
		return this.codePostal;
	}
	
	public String getVille()
	{
		return this.ville;
	}

	/*
	 * Setters
	 */
	public void setRue (String rue)
	{
		this.rue = rue;
	}	
	
	public void setNumAdresse (String numAdresse)
	{
		this.numAdresse = numAdresse;
	}	

	public void setCodePostal (String codePostal)
	{
		this.codePostal = codePostal;
	}

	public void setVille (String ville)
	{
		this.ville = ville;
	}
	
	/*
	 * Main de test
	 */
	public static void main(String args[]){
		
		AdresseLieu a = new AdresseLieu("1,rue Cool,C0O 0L1,Coolville");
		
		System.out.println(a);
	}
	
}

