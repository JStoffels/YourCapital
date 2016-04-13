package nl.jf.yc;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Kandidaat {

	//fields
	//@NotEmpty(message="Kan niet")
	private String naam;	
	//private String skill;
	private Long id;
	private int leeftijd;
	//private ArrayList<String> arrSkills = new ArrayList<String>();

	//default constructor, want bean
	public Kandidaat(){}

	//constructor
	public Kandidaat(String a, int b, String ... s){
		this.naam = a;
		this.leeftijd = b;
		//setArrSkills(s);
	}

	//getters and setters
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
	    return id;
	}
		
	public void setId(Long id) {
		this.id = id;
	}
	
/*	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}*/
	
	public String getNaam(){
		return this.naam;
	}
		
	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getLeeftijd(){
		return this.leeftijd;
	}
	
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}

	/*public ArrayList<String> getArrSkills(){	
		return this.arrSkills;
	}

	public void setArrSkills(String ... s){
		int x = 0;
		for(String str : s){
			arrSkills.add(str);
			x++;
		}		
	}
	*/
}
