package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int n = 2; n<= 9; n++) { //바깥쪽 크게 도는거
			for(int i = 1; i<=9; i++) { //안쪽 작게 도는거
				
				System.out.println(n + " * " + i +" = " + n*i);
				
			}
			System.out.println(" ");
		}

	}

}
