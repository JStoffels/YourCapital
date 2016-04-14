package nl.jf.yc;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Skill {
	
	private String naam;
	private List<Kandidaat> kandidaat;
	
	//default constructor, want bean
	public Skill(){}
	
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

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	@ManyToMany
	public List<Kandidaat> getKandidaten(){
		return kandidaat;
	}
	public void setKandidaten(List<Kandidaat> kandidaat){
		this.kandidaat = kandidaat;
	}
}
