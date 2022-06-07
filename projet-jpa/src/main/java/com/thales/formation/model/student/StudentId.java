package com.thales.formation.model.student;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class StudentId {

	@Column(name="nom")
	private String lastName;
	
	@Column(name="prenom")
	private String firstName;
	
	@Column(name="dateNaissance")
	@Temporal(TemporalType.DATE)
	private Date birthDate;

}
