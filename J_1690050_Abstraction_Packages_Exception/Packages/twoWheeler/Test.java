package com.automobile.twoWheeler;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h=new Hero();
		Honda hd=new Honda();
		h.modelName="2KHGVD";
		h.registrationNumber="KJSOOP213";
		h.ownerName="STEVE ROGERS";
		h.speed=80;
		hd.modelName="602HISH";
		hd.registrationNumber="HVJSJ009";
		hd.ownerName="TONY STARK";
		hd.speed=70;
		System.out.printf("%s\n%s\n%s\n%d\n",h.getModelName(),h.ownerName,h.registrationNumber,h.speed);
		System.out.printf("%s\n%s\n%s\n%d",hd.getModelName(),hd.ownerName,hd.registrationNumber,hd.speed);
	}

}
