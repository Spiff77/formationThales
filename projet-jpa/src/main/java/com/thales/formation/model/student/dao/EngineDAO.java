package com.thales.formation.model.student.dao;

import java.util.List;

import com.thales.formation.model.Engine;

public interface EngineDAO extends GenericDao<Integer, Engine> {
	public List<Engine> findAllByPower(int power);

}
