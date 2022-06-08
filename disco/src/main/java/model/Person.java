package model;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorColumn(name="typePerson")
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
public abstract class Person {
	
	@EmbeddedId 
	private PersonId id;

	@Embedded
	private Address address;

	private int height;

	public Person(PersonId id, Address address, int height) {
		super();
		this.id = id;
		this.address = address;
		this.height = height;
	}
	
	public Person(String firstName, String lastName, Address address, int height) {
		super();
		this.id = new PersonId(firstName, lastName);
		this.address = address;
		this.height = height;
	}
	
	
}
