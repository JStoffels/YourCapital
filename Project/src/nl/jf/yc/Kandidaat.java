package nl.jf.yc;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Kandidaat {

	//default constructor, want bean
	public Kandidaat(){}

	//constructor
	public Kandidaat(String a, int b, String ... s){
		this.naam = a;
		this.leeftijd = b;
		setArrSkills(s);
	}
	
	//Entity related
	private Long id;

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
	    return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	//fields
	//@NotEmpty(message="Kan niet")
	private String naam;
	private String skill;
	private int leeftijd;

	private ArrayList<String> arrSkills = new ArrayList<String>();

	//getters and setters

	//Naam
	public String getNaam(){
		return this.naam;
	}
		
	public void setNaam(String naam) {
		this.naam = naam;
	}
	//Skills
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	//Leeftijd
	public int getLeeftijd(){
		return this.leeftijd;
	}
	
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	//Array skills
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


}
