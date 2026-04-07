package org.java.basic.oopEx;

public class CarEngine {
	public String carEngineName;
	public int carEngineYear;
	public int carEnginePrice;
	
	@Override
	public String toString() {
		return "이름: "+carEngineName+", 년식: "+carEngineYear+", 가격: "+carEnginePrice;
	}
}
