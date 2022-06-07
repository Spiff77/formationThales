package com.thales.formation;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Map;

import com.thales.formation.model.A;
import com.thales.formation.model.B;
import com.thales.formation.model.Car;
import com.thales.formation.model.Engine;
import com.thales.formation.model.Insurance;
import com.thales.formation.model.Option;
import com.thales.formation.model.Owner;
import com.thales.formation.model.VehicleId;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;



public class Entry {

	public static void main(String[] args) {
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
