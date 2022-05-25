package com.ajc.app.parking.model;

import java.util.ArrayList;
import java.util.List;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
public class Parking<T> {

	private List<T> vehicles = new ArrayList<>();
	
	@NonNull
	private String code;
	@NonNull
	private String name;
	
	private List<TollGate> tollGates = new ArrayList<TollGate>();

	
	
	public void add(T vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public int calculTotalPrice() {
		return this.vehicles.stream()
			.filter(v -> v instanceof TollGatePayable)
			.mapToInt(v -> ((TollGatePayable)v).payTollGate())
			.sum();
	
	}
	
	public Parking(@NonNull String code, @NonNull String name) {
		this.code = code;
		this.name = name;
		this.tollGates.add(new TollGate(Orientation.NORTH, Direction.IN));
		this.tollGates.add(new TollGate(Orientation.SOUTH, Direction.OUT));
	}

	@Getter
	public class TollGate{
		private String id;
		private Orientation orientation;
		private Direction direction;
		private boolean enable = true;
		
		public TollGate(Orientation orientation, Direction direction) {
			this.id = Parking.this.code + "#door-" + Parking.this.tollGates.size();
			this.orientation = orientation;
			this.direction = direction;
		}
	}
	
	public enum Orientation{
		NORTH, SOUTH, EAST, WEST;
	}
	
	public enum Direction {
		IN, OUT, INOUT;
	}
	
	
}
