package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.println("과목번호:");
//		int code = sc.nextInt();
		String code = new String("A"); // 로 하게 된다면?
		
		if(code.equals("A")) { // 로 써야함. 객체지향에서 자세히 배울 예정
			System.out.println("R101호");
		} else if(code == "B") {
			System.out.println("R202호");
		} else if (code == "C") {
			System.out.println("R303호");
		} else if(code == "D") {
			System.out.println("R404호");
		} else {
			System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
	}
}
