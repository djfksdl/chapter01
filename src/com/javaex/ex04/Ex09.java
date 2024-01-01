package com.javaex.ex04;

public class Ex09 {
	public static void main(String[] args) {
		
		int no = 1; //카운트 아닌 비교하는 숫자
		
		while(true) {
			//6의 배수이자 14의 배수인 가작 작은 정수찾기
			if(no%6 == 0 && no%14 == 0) {
				System.out.println(no);
				break;
			}
			no++;
			
		}
		
	}
}
