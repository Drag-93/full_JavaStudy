package org.java.basic.oopEx;

public class CarBonnet {

	public String carBonnetName;
	public int carBonnetYear;
	public int carBonnetPrice;
	
	@Override
	public String toString() {
		return "이름: "+carBonnetName+", 년식: "+carBonnetYear+", 가격: "+carBonnetPrice;
	}
	
}
