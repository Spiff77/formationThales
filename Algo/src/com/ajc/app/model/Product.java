package com.ajc.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {
	
	private int id;
	@NonNull
	private String name;
	private static int count = 0;
	
	
	@NonNull
	private float price;
	private static float taux = 20;
	
	
}
