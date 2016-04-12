package nl.jf.yc;

import java.util.ArrayList;

public class Kandidaat {

	//fields
	private String voornaam;
	private int leeftijd;
	private ArrayList<String> arrSkills = new ArrayList<String>();
	                                       
	//default constructor, want bean
	public Kandidaat(){}

	//constructor
	public Kandidaat(String a, int b, String ... s){
		this.voornaam = a;
		this.leeftijd = b;
		setArrSkills(s);
	}

	//getters and setters
	public String getNaam(){
		return this.voornaam;
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
