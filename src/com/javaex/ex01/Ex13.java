package com.javaex.ex01;

public class Ex13 {
	public static void main(String[] args) {
		
		//논리 연산자
		// && and 연산자
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true );
		System.out.println(false && false);
		
		System.out.println("---------------");
		
		// || or 연산자
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("---------------");
		
		//응용
		int a = 5;
		int b = 7;
		System.out.println((a>b)&&(a<b));// 5>7(f) and 5<7(t) => false
		System.out.println((a>b)&&(a>b));// 5>7(f) and 5>7(f) => false
		
		System.out.println((a>b)||(a<b)); // 5>7(f) or 5<7(t) => true
		System.out.println((a>b)&&(a<b)||(a<b)); // {5>7(f) and 5<7(t): f} or 5<7(t) => true
		System.out.println((a<b)||(a>b)||(a>b)); // {5<7(t) or 5>7(f): t} or 5>7(f) => true
		
		System.out.println("---------------");
		
		System.out.println(!(a<b));
		System.out.println(!(a>b));
		System.out.println(!((a>b)||(a<b)));
		
		
		
		
	}
}
