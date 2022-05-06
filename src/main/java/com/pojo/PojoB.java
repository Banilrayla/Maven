package com.pojo;

public class PojoB {

	public static void main(String[] args) {
		PojoA obj = new PojoA();

		int a = obj.getA();
		System.out.println("Before setter:" + a);

		
		
		
		
		
		
		obj.setA(1000);
		int a2 = obj.getA();
		System.out.println("After getter:" + a2);
	}

}
