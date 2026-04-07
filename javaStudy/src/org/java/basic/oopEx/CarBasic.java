package org.java.basic.oopEx;

public class CarBasic {

	public String carName;
	public int carYear;
	public int carPrice;
	
	@Override
	public String toString() {
		return "이름: "+carName+", 년식: "+carYear+", 가격: "+carPrice;
	}
}
