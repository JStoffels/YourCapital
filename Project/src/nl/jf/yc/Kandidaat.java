package nl.jf.yc;

public class Kandidaat {

	//fields
	private String voornaam;
	private int leeftijd;

	
	//constructor
	public Kandidaat(String a, int b){
		this.voornaam = a;
		this.leeftijd = b;
	}
	
	public String getNaam(){
		return this.voornaam;
	}
	
	public int getLeeftijd(){
		return this.leeftijd;
	}
	
}
