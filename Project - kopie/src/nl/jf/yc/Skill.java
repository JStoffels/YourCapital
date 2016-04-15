package nl.jf.yc;

import java.util.List;
<<<<<<< HEAD

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Skill {

	public Skill(){}
	
	private Long id;
	private String naam;
	private List<Kandidaat> personen;

	/* Many to many */
	@ManyToMany
	public List<Kandidaat> getKandidaat() {
		return personen;
	}
	public void setKandidaat(List<Kandidaat> p) {
		this.personen = p;
	}
	
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
	
=======
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
>>>>>>> refs/remotes/origin/master
}
