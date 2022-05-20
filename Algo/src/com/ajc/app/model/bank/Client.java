package com.ajc.app.model.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
	
	private int id;
	private static int countCLient;
	private String firstName;
	private String lastName;
	private List<Compte> comptes = new ArrayList<Compte>();
	
	public Client(String firstName, String lastName, Compte compte) {
		super();
		this.id = ++countCLient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.add(compte);
	}

	public void add(Compte compte) {
		this.comptes.add(compte);
	}
	
	public float calculTotalAvoirs() {
		return (float) comptes.stream().mapToDouble(c -> c instanceof CompteEpargne ? c.getSolde() + ((CompteEpargne)c).calculInterets() : c.getSolde()).sum();
		//return (float) comptes.stream().mapToDouble(Compte::getSolde).sum();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comptes, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(comptes, other.comptes) && Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", comptes=");
		builder.append(comptes);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
