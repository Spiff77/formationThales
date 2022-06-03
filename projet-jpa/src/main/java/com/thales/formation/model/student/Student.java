package com.thales.formation.model.student;

import java.util.Collection;

import jakarta.persistence.Column;
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

@Entity
@Table(name="eleve")
public class Student {

	@Id
	@Column(name="code_eleve")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="nom")
	private String lastName;
	
	@Column(name="prenom")
	private String firstName;
	
	@Column(name="annee_entree")
	private int entranceYear;
	
	@JoinColumn(name="carte_id")
	@OneToOne
	Card card;
	
	@ManyToOne
	@JoinColumn(name="ecole")
	private School school;
	
	@ManyToMany
	@JoinTable(name="elv_cou", 
	joinColumns = @JoinColumn(name= "eleve_id"), 
	inverseJoinColumns = @JoinColumn(name = "cours_id"))
	private Collection<Course> courses;

	
}
