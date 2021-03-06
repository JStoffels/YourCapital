package nl.jf.yc;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SkillDao {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("kandidaten");

	// maakt een skill object in de database aan
	public static Skill create(String naam, Long id) {
		Skill s = new Skill();
		s.setNaam(naam);
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Kandidaat k = em.find(Kandidaat.class, id);
		k.getSkills().add(s);
		em.persist(s);
		em.persist(k);
		t.commit();
		em.close();
		return s;
	}

	// maakt een skill object in de database aan en voegt deze toe aan de
	// kandidaat
	public static void addSkill(long kandidaat_id, long skill_id) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();

		Kandidaat k = em.find(Kandidaat.class, kandidaat_id);
		Skill s = em.find(Skill.class, skill_id);
		if (k == null || s == null) {
			System.out.println("addSkill(): kandidaat of skill bestaat niet!!");
			return;
		}
		s.getKandidaten().add(k);
		em.persist(k);
		t.commit();
		em.close();
	}

	// haalt de lijst met skills op uit de database
	public static List<Skill> all(long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Kandidaat k = em.find(Kandidaat.class, id);
		List<Skill> s = k.getSkills();
		t.commit();

		return s;
	}

	// verwijdert een skill object uit de database
	public static void remove(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Skill s = em.find(Skill.class, id);
		if (s != null) {
			em.remove(s);
		}
		t.commit();
		em.close();
	}

	// zoekt een skill object in de database
	public static Skill find(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Skill s = em.find(Skill.class, id);
		t.commit();
		em.close();
		return s;
	}
}
