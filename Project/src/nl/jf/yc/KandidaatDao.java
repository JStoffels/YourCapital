package nl.jf.yc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class KandidaatDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kandidaten");

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
	
	public static List<Kandidaat> all(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Kandidaat> ritten = em.createQuery("from Kandidaat", Kandidaat.class).getResultList();
		t.commit();
		em.close();
		return ritten;
	}
}
