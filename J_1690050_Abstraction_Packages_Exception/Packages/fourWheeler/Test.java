package com.automobile.fourWheeler;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logan l=new Logan();
		Ford f=new Ford();
		l.modelName="2KHGVD";
		l.registrationNumber="KJSOOP213";
		l.ownerName="STEVE ROGERS";
		l.speed=80;
		l.gps=68;
		f.modelName="602HISH";
		f.registrationNumber="HVJSJ009";
		f.ownerName="TONY STARK";
		f.speed=70;
		f.temperature=28;
		System.out.printf("%s\n%s\n%s\n%d\n%d\n",l.getModelName(),l.ownerName,l.registrationNumber,l.speed,l.gps);
		System.out.printf("%s\n%s\n%s\n%d\n%d",f.getModelName(),f.ownerName,f.registrationNumber,f.speed,f.temperature);
	}

}
