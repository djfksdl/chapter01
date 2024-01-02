package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		int[] rArray = new int[6];
		
		for(int i =0; i<rArray.length; i++) {
			rArray[i]= (int)(Math.random()*45)+1;
			
		}
		
		for(int i = 0; i < rArray.length; i++) {
			System.out.println(rArray[i]);
		}

	}

}
