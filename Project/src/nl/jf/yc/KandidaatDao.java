package nl.jf.yc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class KandidaatDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kandidaten");

	// maakt een kandidaat object in de database aan
	public static Kandidaat create(String naam, int leeftijd, String woonplaats) {
		Kandidaat k = new Kandidaat();
		k.setNaam(naam);
		k.setLeeftijd(leeftijd);
		k.setWoonplaats(woonplaats);
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
		//k.setSkills(null);
		//em.persist(k);
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
}
