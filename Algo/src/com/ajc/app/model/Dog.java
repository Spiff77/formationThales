package com.ajc.app.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class Dog extends AnimalCarnivor implements Serializable{
	
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	private Product product;


	private transient String pedigre;
	
	public Dog(String name, String pedigre) {
		super(name);
		this.pedigre = pedigre;
	}

	public void mangeDesCroquettes() {
		System.out.println("Canigou miamiam");
	}
	
	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sayHello() {
		System.out.println("wafwaf");
		
	}
	
	public String getPedigre() {
		return pedigre;
	}

	public void setPedigre(String pedigre) {
		this.pedigre = pedigre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [product=");
		builder.append(product);
		builder.append(", pedigre=");
		builder.append(pedigre);
		builder.append(", quantiteViande=");
		builder.append(quantiteViande);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
