package nl.jf.yc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



public class KandidaatDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kandidaten");

	// maakt een kandidaat object in de database aan
	public static Kandidaat create(String naam, int leeftijd) {
		Kandidaat k = new Kandidaat();
		k.setNaam(naam);
		k.setLeeftijd(leeftijd);	
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(k);		
		t.commit();
		em.close();		
		return k;
	}
	
	public static Skill create(String naam) {
		Skill s = new Skill();
		s.setNaam(naam);
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(s);		
		t.commit();
		em.close();		
		return s;
	}
	
	// haalt de lijst met kandidaten op uit de database
	public static List<Kandidaat> all(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Kandidaat> kandidaten = em.createQuery("from Kandidaat", Kandidaat.class).getResultList();
		t.commit();
		em.close();
		return kandidaten;
	}
	
	// haalt de lijst met kandidaten op uit de database
	public static List<Skill> allSkill(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Skill> skills = em.createQuery("from Skill", Skill.class).getResultList();
		t.commit();
		em.close();
		return skills;
	}
	
	// verwijdert een kandidaat object uit de database
	public static void remove(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Kandidaat k = em.find(Kandidaat.class, id);
		if(k != null){
			em.remove( k );
		}
		t.commit();
		em.close();
	}
	
	// zoekt een kandidaat object in de database
	public static Kandidaat find(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Kandidaat k = em.find(Kandidaat.class, id);
		t.commit();
		em.close();
		return k;
	}
	
	
	//<!-- 	<c:forEach items=${kandidaat.skills} />-->

}
