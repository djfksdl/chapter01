package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {
		
		//byte
		byte no = 127; //-128~127
		
		//no = -129;  //byte형의 범위를 벗어남
		
		System.out.println(no);
		
		/////////////////////////////////////

		// int
		int num = 2147483647; // 마지막 숫자를 7->8로 바꾸면? 이클립스가 미리 오류나기전에 알려줌
		
		System.out.println(num);
		
		///////////////////////////////////
		
		// long
		// 맨뒤에 L을 붙여야한다. 소문자도 상관없긴함. 안붙이면 에러가 남 
		// int 범위까지는 뒤에 L을 안붙이고 써도됨. 근데 그 범위를 넘어가면 L을 붙여줘야한다. 근데 그냥 L붙여도된다. int범위를 계속 알고싶지 않다면!
//		long num2 = 9223372036854775807L;
//		System.out.println(num2);
		
		long num2 = 2147483647;
		System.out.println(num2);
		
		////////////////////////////////////
		// 변수선언, 초기화
		int var01;
		int var02;
		int var03;
//		int var01, var02, var03; 같은 표현이다.
		
		// 초기화 대입
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		// 출력
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		///////////////////////////////////
//		int var04 = 100;
//		int var05 = 200;
//		int var06 = 300;
		
		int var04 = 100, var05 = 200, var06 = 300; // 이렇게 한줄에 쓸 수 있다.
		
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);
		

	}
}
