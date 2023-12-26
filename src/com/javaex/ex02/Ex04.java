package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		//안내문구
		System.out.println("이름을 입력해주세요");
		
		//이름:
		System.out.print("이름: ");
		
		//이름 입력
		String name = sc.nextLine();
		
		//안내문구2
		System.out.println("나이를 입력해주세요");
		
		//나이:
		System.out.print("나이: ");
		
		//나이 입력
		int age = sc.nextInt();
		
		//안내문구3
		System.out.println("키를 입력해주세요");
		
		//키:
		System.out.print("키: ");
		
		//키 입력
		double height = sc.nextDouble();
		
		//결과물입력
		System.out.println("당신의 이름은 "+ name + " 나이는 " + age + " 키는 " + height + " 입니다.");
		
		// 스캐너 종료
		sc.close();

	}

}
