package nl.jf.yc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class KandidaatDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kandidaten");

	public static Kandidaat create() {
		Kandidaat k = new Kandidaat();
		k.setLeeftijd(29);
		k.setNaam("Fur");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(k);
		
		t.commit();
		em.close();
		
		return k;
	}
}
