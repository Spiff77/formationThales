package model;



import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public @Data class Address {
	
	private int streetNumber;
	private String streetName;
	private int postalCode;
	private String country;
	

	
	public Address(int streetNumber, String streetName, int postalCode, String country) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	
	
}
