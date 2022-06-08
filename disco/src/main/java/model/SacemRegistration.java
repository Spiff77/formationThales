package model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "sacem_registration")
@AllArgsConstructor
@NoArgsConstructor
public @Data class SacemRegistration {
	
	@Id
	private String reference;
	
	private Date dateRegistration;
	
}

