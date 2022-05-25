package com.ajc.app.parking.model.observer;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CitySign implements Observer{
	private int id;
	
	@NonNull
	private String info;

	public CitySign() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String message) {
		System.out.println(message);
		this.info = message;
	}

}
