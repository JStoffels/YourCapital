package nl.jf.yc;

import java.util.ArrayList;

import org.hibernate.validator.constraints.NotEmpty;

public class Kandidaat {

	//fields
	//@NotEmpty(message="Kan niet")
	private String naam;
	
	private int leeftijd;

	private ArrayList<String> arrSkills = new ArrayList<String>();

	//default constructor, want bean
	public Kandidaat(){}

	//constructor
	public Kandidaat(String a, int b, String ... s){
		this.naam = a;
		this.leeftijd = b;
		setArrSkills(s);
	}

	//getters and setters
	public String getNaam(){
		return this.naam;
	}
		
	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getLeeftijd(){
		return this.leeftijd;
	}

	public ArrayList<String> getArrSkills(){	
		return this.arrSkills;
	}

	public void setArrSkills(String ... s){
		int x = 0;
		for(String str : s){
			arrSkills.add(str);
			x++;
		}		
	}



	/*public void setArrSkills(String ... s){
		int x = 0;
		for(String str : s){
			arrSkills.add(str);
			x++;
		}		
	}*/

	// TO STRING ALLEEN OP ARRAYLIST	
	/*public ArrayList<String> getArrSkills(){	
		return this.arrSkills;
	}*/

}
