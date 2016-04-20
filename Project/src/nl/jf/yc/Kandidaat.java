package nl.jf.yc;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Kandidaat {

	//default constructor, want bean
	public Kandidaat(){}
	
	//fields
	//@NotEmpty(message="Kan niet")
	private String naam;
	private int leeftijd;
	private List<Skill> skills;
	private String woonplaats;
	
	public String getWoonplaats() {
		return woonplaats;
	}

	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
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
	
	@ManyToMany(mappedBy="kandidaten", cascade=CascadeType.ALL)
	//@JoinTable(name = "skill_kandidaat", joinColumns = @JoinColumn(name = "id"))
	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

}
