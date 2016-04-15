package nl.jf.yc;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Kandidaat {

	private List<Skill> skills;
	
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
	private int leeftijd;

	//getters and setters
	//Naam
	public String getNaam(){
		return this.naam;
	}
		
	public void setNaam(String naam) {
		this.naam = naam;
	}

	//Leeftijd
	public int getLeeftijd(){
		return this.leeftijd;
	}
	
	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	
	@ManyToMany(mappedBy="kandidaten")
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> s) {
		this.skills = s;
	}

}
