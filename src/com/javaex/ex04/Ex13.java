package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		
		int sum = 0;
		int no;
		
		do {// 일단 한번은 하고, 
			no = sc.nextInt();
			sum = sum + no;
			System.out.println(sum);
			
		}while(no != 0);  // 0이 아니면 
			
			
			
		/*
		while(true) {
			int no = sc.nextInt();
			if(no == 0) {
				break;	
			}
			
			//더하기
			sum = sum + no;
			System.out.println(sum);
		}
		*/
		System.out.println("종료");
		sc.close();
		
		//입력
		// break는 switch-case문은 그냥 밑에 탈출을 못함
		// vs if else문?과는 다른 break다
		// for은 조건으로 써줘야하고 반복횟수를 알 수 없을때 
	}

}
