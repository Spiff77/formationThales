package com.thales.formation.model.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="carte")
public class Card {

	@Id
	@Column(name="carte_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardNb;

	@Column(name="type_acces")
	private String accessType;
	
	@OneToOne(mappedBy = "card")
	private Student student;
	
}
