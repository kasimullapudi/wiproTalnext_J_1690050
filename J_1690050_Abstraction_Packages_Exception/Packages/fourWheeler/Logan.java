package com.automobile.fourWheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle {
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	int gps;
	public String getModelName() {
		return this.modelName;
	}
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int gps() {
		System.out.println("Controlling gps");
		return gps;
	}
}
