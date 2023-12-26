package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//스캐너 준비
		Scanner sc = new Scanner(System.in); // System.in이 키보드라는 뜻
		
		// 안내출력
		System.out.println("이름을 입력해주세요");
		
		// 이름:
		System.out.print("이름: ");
		
		// 이름 입력받기
		String name = sc.nextLine(); // 만약에 sc.next();로 썼으면 이름 띄워쓰기하면 띄워쓰기 전으로 끝이 난다. 그래서 nextLine()으로 하는게 좋음
		
		// 안내문구
		System.out.println("나이를 입력해주세요");
		
		// 나이:
		System.out.print("나이: ");
		
		// 나이 입력받기
		int age = sc.nextInt();
		
		// 출력
		System.out.println("당신의 이름은 " + name +", 나이는 " + age + "입니다.");
		
		// 스캐너종료
		sc.close();
		

	}

}
