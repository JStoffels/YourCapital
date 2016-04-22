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

	// default constructor, want bean
	public Kandidaat() {
	}

	// fields
	private String naam;
	private String leeftijd;
	private List<Skill> skills;
	private String woonplaats;
	private String foto;
	private String geslacht;
	private String quote;
	private String notes;
	
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getMaxreisafstand() {
		return maxreisafstand;
	}

	public void setMaxreisafstand(String maxreisafstand) {
		this.maxreisafstand = maxreisafstand;
	}

	public String getOpmerkingen() {
		return opmerkingen;
	}

	public void setOpmerkingen(String opmerkingen) {
		this.opmerkingen = opmerkingen;
	}

	private String maxreisafstand;
	private String opmerkingen;

	// Entity related
	private Long id;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// getters and setters
	// Naam
	public String getNaam() {
		return this.naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	// Leeftijd
	public String getLeeftijd() {
		return this.leeftijd;
	}

	public void setLeeftijd(String leeftijd) {
		this.leeftijd = leeftijd;
	}

	@ManyToMany(mappedBy = "kandidaten", cascade = CascadeType.ALL)
	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getWoonplaats() {
		return woonplaats;
	}

	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
}
