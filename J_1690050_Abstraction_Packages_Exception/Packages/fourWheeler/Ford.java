package com.automobile.fourWheeler;
import com.automobile.*;
public class Ford extends Vehicle{
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	int temperature;
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
	public int tempControl() {
		System.out.println("Controlling Air Conditioning..");
		return temperature;
	}
}
