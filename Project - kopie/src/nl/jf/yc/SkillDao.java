package nl.jf.yc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



public class SkillDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kandidaten");

	// maakt een kandidaat object in de database aan

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
	public static List<Skill> all(){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Skill> s = em.createQuery("from Skill", Skill.class).getResultList();
		t.commit();
		em.close();
		return s;
	}
	
	// verwijdert een kandidaat object uit de database
	public static void remove(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Skill s = em.find(Skill.class, id);
		if(s != null){
			em.remove( s );
		}
		t.commit();
		em.close();
	}
	
	// zoekt een kandidaat object in de database
	public static Skill find(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Skill s = em.find(Skill.class, id);
		t.commit();
		em.close();
		return s;
	}
	
	
	
}
