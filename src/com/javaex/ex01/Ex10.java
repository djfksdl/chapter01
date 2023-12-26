package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		// 증감 연산자
		int a;
		a = 7;
		
		System.out.println(a);
		//System.out.println(++a); // ++이 앞에 붙으면 이 줄에서 제일 먼저 작동함(먼저 1.올리고, 2.출력)
		//System.out.println(a); // a의 원본값이 바뀌었는지 확인하기 위해서 한번더 a값을 출력해본것! (가설을 확인할 수 있는 설계를 할 수 있어야함)
		
		//System.out.println(--a);
		//System.out.println(a);
		
		System.out.println(a);
		System.out.println(++a); //8
		System.out.println(a); //8
		System.out.println(++a); //9
		System.out.println(a);  //9
		System.out.println(--a); //8
		System.out.println(a); //8
		System.out.println(--a); //7
		System.out.println(--a); //6
		System.out.println(a); //6
	}

}
