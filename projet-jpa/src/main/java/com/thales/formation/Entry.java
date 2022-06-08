package com.thales.formation;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.thales.formation.model.A;
import com.thales.formation.model.B;
import com.thales.formation.model.Car;
import com.thales.formation.model.Engine;
import com.thales.formation.model.Insurance;
import com.thales.formation.model.Option;
import com.thales.formation.model.Owner;
import com.thales.formation.model.VehicleId;
import com.thales.formation.model.student.utils.ConnectionManager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transaction;



public class Entry {

	public static void main(String[] args) {
		EntityManager em = ConnectionManager.getInstance().getEmf().createEntityManager();

		B b = em.find(B.class, 3);
		
		em.getTransaction().begin();
		
		em.remove(b);
		
		em.getTransaction().commit();
		
		em.close();
		ConnectionManager.getInstance().close();
		
		
	}

	private static void typedQueryEx() {
		EntityManager em = ConnectionManager.getInstance().getEmf().createEntityManager();
		
		TypedQuery<Car> query = em.createQuery("SELECT c FROM Car c WHERE c.engine.power > :power", Car.class);
		query.setParameter("power", 100);
		
		List<Car> cars = query.getResultList();
		
		for (Car car : cars) {
			System.out.println(car);
		}
	}
	
	// créer un artiste qui n'existe pas avec merge //
	// Le modifier ensuite //
	
	public static void testMerge() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");
		EntityManager em =emf.createEntityManager();
		
		Insurance i = new Insurance();
		i.setId("402881ad814320e501814320ea700000");
		i.setAmount(30000);
		
		em.getTransaction().begin();
		
		Insurance iMerged = em.merge(i);
		System.out.println(iMerged);
		
		iMerged.setAmount(40000);
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	public void getAlbum() {
		// affiche un album de la base (en spécifiant un id)
	}
	
	public static void add() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("car");
		EntityManager em =emf.createEntityManager();
		
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		A a = new A();
		B b = new B();
		
		a.setB(b);
		em.persist(a);
		em.persist(b);
		
		Owner o = new Owner("Jacques");
		Insurance insurance = new Insurance(200,30, 23);
		
		em.persist(o);
		em.persist(insurance);
		
		o.add(insurance);	
		
		transaction.commit();
		
		em.refresh(insurance);
		
		System.out.println(insurance.getBeneficaries().size());
		test(em);
		
		
		
		em.close();
		emf.close();
	}
	
	public static void test(EntityManager em) {
		final org.hibernate.engine.spi.SessionImplementor session = em.unwrap( org.hibernate.engine.spi.SessionImplementor.class );
		final org.hibernate.engine.spi.PersistenceContext pc = session.getPersistenceContext();
		final Map.Entry<Object,org.hibernate.engine.spi.EntityEntry>[] entityEntries = pc.reentrantSafeEntityEntries();
		for (Map.Entry<Object, org.hibernate.engine.spi.EntityEntry> entry : entityEntries) {
			System.out.println(entry.getKey() + " -> " +entry.getValue());
		}
	}
	
}
