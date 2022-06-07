package com.thales.formation.model.student;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="eleve")
public class Student {

	@EmbeddedId
	private StudentId id;
	
	@Column(name="annee_entree")
	private int entranceYear;
	
	@JoinColumn(name="carte_id")
	@OneToOne
	Card card;
	
	@ManyToOne
	@JoinColumn(name="ecole")
	private School school;
	
	@Embedded
	private Address address;
	
	@ManyToMany
	@JoinTable(name="elv_cou", 
	joinColumns = {@JoinColumn(name= "nomEleve"), @JoinColumn(name= "prenomEleve"), @JoinColumn(name= "dateNaissanceEleve")}, 
	inverseJoinColumns = @JoinColumn(name = "cours_id"))
	private Collection<Course> courses;

	
}
