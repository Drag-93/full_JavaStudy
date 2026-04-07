package org.java.basic.oopEx;

public class CarMain {

	public static void main(String[] args) {
		CarBasic carA= new CarBasic();
		carA.carName="ACar";
		carA.carPrice=3000;
		carA.carYear=2026;
		String rs1=carA.toString();
		System.out.println(rs1);
		
		CarBonnet carAbonnet= new CarBonnet(); 
		carAbonnet.carBonnetName="Abonnet";
		carAbonnet.carBonnetYear=2026;
		carAbonnet.carBonnetPrice=50000;
		System.out.println(carAbonnet.toString());
		
		CarDoor carDoor= new CarDoor();
		carDoor.carDoorName="ACarDoor";
		carDoor.carDoorYear=2026;
		carDoor.carDoorPrice=150000;
		System.out.println(carDoor.toString());
		
		CarEngine carEngine= new CarEngine();
		carEngine.carEngineName="ACarEngine";
		carEngine.carEngineYear=2026;
		carEngine.carEnginePrice=500000;
		System.out.println(carEngine.toString());
	}
}
