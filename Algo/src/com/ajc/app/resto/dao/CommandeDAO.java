package com.ajc.app.resto.dao;

import java.util.List;

import com.ajc.app.resto.model.Commande;
import com.ajc.app.resto.model.Edessert;

public interface CommandeDAO extends GenericDao<String, Commande> {
	public List<Commande> findAllByDessert(Edessert dessert);
}
