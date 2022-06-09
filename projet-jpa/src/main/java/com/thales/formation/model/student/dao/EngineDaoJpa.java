package com.thales.formation.model.student.dao;

import java.util.List;

import com.thales.formation.model.Engine;
import com.thales.formation.model.student.utils.ConnectionManager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class EngineDaoJpa implements EngineDAO{

	
	public List<Engine> findAll() {
		EntityManager em = ConnectionManager.getInstance().getEmf().createEntityManager();
		
		return null;
	}

	public Engine findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Engine obj) {
		EntityManager em = ConnectionManager.getInstance().getEmf().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		try {
			em.persist(obj);
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
		}finally {
			if(em != null && em.isOpen())
			em.close();
		}	
	}

	public void update(Engine obj) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Engine obj) {
		// TODO Auto-generated method stub
		
	}

	// --> findByYear(int year)
	
	public List<Engine> findAllByPower(int power) {
		EntityManager em = ConnectionManager.getInstance().getEmf().createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<Engine> query = cb.createQuery(Engine.class);
		Root<Engine> from = query.from(Engine.class);
		
		
		Predicate p = cb.greaterThan(from.get("power").as(Integer.class), power);
		
		CriteriaQuery<Engine> select = query.select(from).where(p);
		
		
		TypedQuery<Engine> tQuery = em.createQuery(select);
		List<Engine> resultList = tQuery.getResultList();
		
		
		return resultList;
	}

}
