package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// "근무시간:"출력
		System.out.print("근무시간: ");

		// 근무시간 입력받기
		int time = sc.nextInt();
		
		// 급여계산
		/*1~8 : 근무시간*10000
		 * 9이상(8초과) : 공식
		 * */
		// 급여출력 : "임금은 (계산된 값)원 입니다.
		
		int salary; // 로 바깥에서 선언해줘야 안에 있는 salary가 안없어짐. 대신 안에 있는 salsry에서는 int를 없애야한다.
		if(time <= 8) {
			salary = time*10000;
			//System.out.println("임금은 " + salary +"원 입니다.");
			
		} else {
			salary = 80000+ (time -8)*12000;
			//System.out.println("임금은 " + salary + "원 입니다.");
		}
		
		System.out.println("임금은 " + salary +"원 입니다."); //응답문구가 공통이라 하나로 쓰는 방법
		
		sc.close();
	}
}
