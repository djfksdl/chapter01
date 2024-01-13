package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) { //함수 또는 메소드 , 빨간색으로 나오는건 예약어 , main이라고 쓴 메소드를 제일먼저 실행함. main은 내가 지은 이름이지만 특별한 애이다. 
		
		// 선언
		int myAge; // 공간을 잡은것, 앞에 숫자쓸래 문자 쓸래(=자료형을 쓰면) 하면 새로 잡는거다.
		// int myAge = 25;로 해도됨
		// 다만 나중에 공간도 만들어놓고(int myAge)나중에 값 넣을때 int myAge = 25;라고 쓰게 되면 중복되는거라 오류가 남! 그래서 나중에 꼬일수있어서 2호흡으로 나눠서 한다.
		
		// 초기화 or 대입
		myAge = 25; // 이미 공간이 있는거에 쓴거라 앞에 자료형은 굳이 쓰지 않음
		
		// 출력
		System.out.println(myAge); //'컨트롤 + 스페이스'하면 자동완성됨
		
		//값 변경
		myAge = 100;
		
		System.out.println(myAge);
	}
}
