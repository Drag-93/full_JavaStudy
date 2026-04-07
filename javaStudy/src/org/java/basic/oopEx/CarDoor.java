package org.java.basic.oopEx;

public class CarDoor {
	public String carDoorName;
	public int carDoorYear;
	public int carDoorPrice;
	
	@Override
	public String toString() {
		return "이름: "+carDoorName+", 년식: "+carDoorYear+", 가격: "+carDoorPrice;
	}
}
