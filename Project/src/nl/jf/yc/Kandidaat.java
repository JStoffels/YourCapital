package nl.jf.yc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Kandidaat {

	//default constructor, want bean
	public Kandidaat(){}

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

}
