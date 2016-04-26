package nl.jf.yc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class KandidaatDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kandidaten");

	// maakt een kandidaat object in de database aan
	public static Kandidaat create(String naam, String leeftijd, String woonplaats, String foto) {
		Kandidaat k = new Kandidaat();
		k.setNaam(naam);
		k.setLeeftijd(leeftijd);
		k.setWoonplaats(woonplaats);
		k.setFoto(foto);
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
	
	public static Kandidaat editNaam(String naam, Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Kandidaat k = em.find(Kandidaat.class, id);
		k.setNaam(naam);
		t.commit();
		em.close();
		return k;
	}
	
	
}
