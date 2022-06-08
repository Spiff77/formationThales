package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.PrimaryKeyJoinColumns;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="artist")
@DiscriminatorValue("artist")
@PrimaryKeyJoinColumns(value = {
	    @PrimaryKeyJoinColumn(name = "p_firstName"),
	    @PrimaryKeyJoinColumn(name = "p_lastName")
	})
@NoArgsConstructor
public @Data class Artist extends Person{

	private int size;
	
	private String bandName;
	
	@OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
	@ToString.Exclude
	private List<Album> listAlb = new ArrayList<Album>();
	
	@OneToOne   //pas de mappedBy car rien de l'autre coté
	private SacemRegistration sacem;

	
	public Artist(PersonId id, Address address, int height, int size, String bandName) {
		super(id, address, height);
		this.size = size;
		this.bandName = bandName;
	}





}
