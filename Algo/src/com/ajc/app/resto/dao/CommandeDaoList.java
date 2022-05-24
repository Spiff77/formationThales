package com.ajc.app.resto.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ajc.app.resto.model.Commande;
import com.ajc.app.resto.model.Eboisson;
import com.ajc.app.resto.model.Edessert;
import com.ajc.app.resto.model.Eplat;

public class CommandeDaoList implements CommandeDAO {

	public List<Commande> commandes = new ArrayList<Commande>(
			Arrays.asList(
				new Commande("Commande 1", Eboisson.BIERE, Eplat.COUSCOUS, Edessert.GLACE),
				new Commande("Commande 2", Eboisson.BIERE, Eplat.COUSCOUS, Edessert.GLACE)
		));
	
	
	@Override
	public List<Commande> findAll() {
		return this.commandes;
	}

	@Override
	public Commande findOne(String id) {
		return this.commandes.stream().filter( c -> c.getName().equals(id)).findFirst().get();
	}

	@Override
	public void delete(String id) {
		Commande co = this.commandes.stream().filter(c -> c.getName().equals(id)).findFirst().get();
		this.commandes.remove(co);
	}

	@Override
	public void update(Commande object) {
		Commande co = this.commandes.stream().filter(c -> c.getName().equals(object.getName())).findFirst().get();
		int index = this.commandes.indexOf(co);
		this.commandes.set(index, object);
		
	}

	@Override
	public void add(Commande object) {
		this.commandes.add(object);
	}

	@Override
	public List<Commande> findAllByDessert(Edessert dessert) {
		return this.commandes.stream().filter(c -> c.getDessert().equals(dessert)).collect(Collectors.toList());

	}



}
