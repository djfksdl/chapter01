package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		char ch01 = 'A';
		char ch02 = '황';
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		char ch03 = 65; // 65가 A를 해당하는 문자임. 그래서 원래는 한글자 들어가야해서 65라는 두글자가 안들어가는데 이건 코드로 인식해서 나온거임!
		System.out.println(ch03); 
		
		char ch04 = '3';
		System.out.println(ch04);
		
//		char ch05 = "황";
//		System.out.println(ch05); // 쌍따옴표는 인식 못함. , 두글자도 안됨        
		
		
		//////////////////////
		// String 사용법만 익히자
		
		String name = "황일영"; //스트링은 쌍따옴표로 쓰기
		System.out.println(name);
		
		char name2 = '황';
		System.out.println(name2);
	}
}
