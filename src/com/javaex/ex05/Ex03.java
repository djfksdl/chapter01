package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 55;
		
		for(int i=0; i<4; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("====================");
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		/*
		System.out.println(intArray[0]);
		System.out.println(intArray[4]);
		*/
	}

}
