package com.javaex.ex01;

public class Ex11 {
	public static void main(String[] args) {
		
		//증감연산자
		
		int b = 10;
		
		//System.out.println(b);
		//System.out.println(b++); // 뒤에 붙이면 1.출력, 2.+1을 해준다는 뜻이다
		//System.out.println(b);
		
		//System.out.println(b--);
		//System.out.println(b);
		
		System.out.println(b); // 10 출력
		System.out.println(b++); // 10->(11) 출력,++
		System.out.println(b++); // 11->(12)
		System.out.println(b); // 12
		System.out.println(b--); // 12->(11)
		System.out.println(b); // 11
		
		System.out.println("-----------------");
		int no = 10;
		//System.out.println(++no + 3); // (11 + 3) = 14  {++no, +3, 출력}
		//System.out.println(no-- + 3); // (10(9) +3) = 13  {+3, 출력 , no--}
		
		//++no; //11
		//++no; //12
		//System.out.println(no); //12
		
		no++; //11
		++no; //12
		System.out.println(no); //12

	}
}
