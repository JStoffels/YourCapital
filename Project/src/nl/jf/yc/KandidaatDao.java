package nl.jf.yc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
		
	// haalt de lijst met skills op uit de database
	public static List<Kandidaat> allNaam(String naam){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Kandidaat> k = em.createQuery("from Kandidaat where k.naam = naam", Kandidaat.class).getResultList();
		t.commit();
		em.close();
		return k;
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
	
	/* // haalt de lijst met skills op uit de database
	public static List<Skill> allSkill(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Skill> skills = em.createQuery("from Skill", Skill.class).getResultList();
		t.commit();
		em.close();
		return skills;
	} */
	
	/* //maakt een skill object in de database aan
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
	}*/
}
