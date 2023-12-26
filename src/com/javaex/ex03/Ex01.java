package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		
		if( point >= 60 ) {
			
			System.out.println("합격입니다.");
		}
		
		sc.close(); //키보드만 닫는거임. 이걸로 프로그램 종료가 아니라
		
		System.out.println("프로그램 종료");

	}

}
