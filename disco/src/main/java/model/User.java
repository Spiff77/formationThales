package model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.PrimaryKeyJoinColumns;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@DiscriminatorValue("user")
@PrimaryKeyJoinColumns(value = {
	    @PrimaryKeyJoinColumn(name = "p_firstName"),
	    @PrimaryKeyJoinColumn(name = "p_lastName")
	})
@NoArgsConstructor
public @Data class User extends Person{
		
	private Date birthDate;
	
	@OneToMany(mappedBy = "owner")
	private List<PlayList> list;
	

	public User(PersonId id, Address address, int height, Date birthDate) {
		super(id, address, height);
		this.birthDate = birthDate;
	}
}
