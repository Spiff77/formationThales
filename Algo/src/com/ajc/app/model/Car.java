package com.ajc.app.model;

public class Car {
	
	private int id;
	private static int count = 0;
	private int speed;
	private static int maxSpeed = 220;
	private CarInfo carInfo;
	
	public Car(CarInfo carInfo) {
		super();
		this.id = ++count;
		this.carInfo = carInfo;
	}

	public Car(int speed, CarInfo carInfo) {
		this(carInfo);
		this.setSpeed(speed);

	}
	
	public Car(String serialNumber, String brand, int speed) {
		this(speed, new CarInfo(serialNumber, brand));
	}
	
	public String compare(Car car) {
		
		if(this.speed > car.speed) {
			return "The car " + this.carInfo.getBrand()  + " is faster thant the car " + car.carInfo.getBrand();
		}else if(this.speed < car.speed) {
			return "The car " + this.carInfo.getBrand()  + " is slower thant the car " + car.carInfo.getBrand();
		}else {
			return "The car " + this.carInfo.getBrand()  + " is at the same speed of the car " + car.carInfo.getBrand();
		}		
		
	}
	
	public static String compare(Car c1, Car c2) {
		return c1.compare(c2);
	}
	
	public void accelerate(int speed) {
		this.speed = Math.min(speed + this.speed, maxSpeed);
	}

	public void decelerate(int speed) {
		this.speed = Math.max(speed - this.speed, 0);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = Math.min(speed, maxSpeed);
	}

	public static int getMaxSpeed() {
		return maxSpeed;
	}

	public static void setMaxSpeed(int maxSpeed) {
		Car.maxSpeed = maxSpeed;
	}

	public CarInfo getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(CarInfo carInfo) {
		this.carInfo = carInfo;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", speed=" + speed + ", carInfo=" + carInfo + "]";
	}
	
}
