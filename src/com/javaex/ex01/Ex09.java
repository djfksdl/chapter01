package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		// 대입연산자
		int a = 7;
		int b = 2;
		
		// 산술 연산자
//		int var01 = a+b;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 나누기 -> 몫
		System.out.println(a%b); // 나누기 -> 나머지
		
		System.out.println("--------------------------");
		
		// %연산자 자세히
		System.out.println(7/2);   // 3
		System.out.println(7.0/2); // 3.5
		System.out.println(7%2);   // 1
		System.out.println(7.0%2); // 1.0
		
		System.out.println("--------------------------");
		
		int var = -3;
		int pVar = +var; // +(-3) => -3
		int mVar = -var; // -(-3) => +3
		System.out.println(pVar);
		System.out.println(mVar);
	}

}
