package app;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;
import model.Address;
import model.Album;
import model.Artist;
import model.PersonId;



public class Entry {

	public static void main(String[] args) {
		getAlbum();
	}
	
	public static void getAlbum() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("disco");
		EntityManager em =emf.createEntityManager();
		
		Album a = em.find(Album.class, 1);
		//em.clear();
		System.out.println("ALBUM FETCHED");
		System.out.println(a);
		System.out.println(a.getCreator().getBandName());
	    //test(em);
		//System.out.println(a.getCreator());
		
		em.close();
		emf.close();
	}
	
	public static void add() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("disco");
		EntityManager em =emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Artist a =  new Artist(new PersonId("Frank", "Zappa"), new Address(12, "street of the road", 32443, "USA"), 1, 1, "Mothers of invention");
		Album a1 = new Album("Joe's garage", 1989, a);		
		
		em.persist(a);
		em.persist(a1);
		
		test(em);
		
		em.getTransaction().commit();		
		em.close();
		emf.close();
	}
	
	public static void test(EntityManager em) {
		final org.hibernate.engine.spi.SessionImplementor session = em.unwrap( org.hibernate.engine.spi.SessionImplementor.class );
		final org.hibernate.engine.spi.PersistenceContext pc = session.getPersistenceContext();
		final Map.Entry<Object,org.hibernate.engine.spi.EntityEntry>[] entityEntries = pc.reentrantSafeEntityEntries();
		for (Map.Entry<Object, org.hibernate.engine.spi.EntityEntry> entry : entityEntries) {
			System.out.println(entry.getValue());
		}
	}
	
}

// Recupérer un artiste avec tous ses albums en EAGER
// Recuperer l'artiste de l'album en LAZY
// Récupérer toutes les playlistes en EAGER
