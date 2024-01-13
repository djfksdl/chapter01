package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		int var00 = 3 + 5;
		System.out.println(var00);
		
		//자동형변환
		int a =3; 
		double b = 3.5;  
		double var02 = a+b; //  a= 3.0으로 자동 형변환됨
		System.out.println(var02);

		//////////////////////////
		
		//강제 형변환
		float var04 = 1111.6435F;
		int var05 = (int)var04;
		System.out.println(var04); // 바꿔도 원본이 남아있는지 확인한것
		System.out.println(var05);
		
		//축소 형변환(int->byte)
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);  //값이 변하지 않는다 이유공부하기
		
		//축소 형변환(int -> byte)
		int v03 = 203029770;
		byte v04 = (byte)v03;
		System.out.println(v04); // 값이 변하는 이유 공부하기 위에것과 비교해서! 차이점은 큰값, 작은값이다.
		
		//확대 형변환(byte -> int)
		byte v05 = 127;
		int v06 = (int)v05;
		System.out.println(v06); // 값이 그대로 나오는 이유 공부
		
		//실수 -> 정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08); //정수끼리 줄이고 확대하는 규칙과 다르다. 소숫점만 버릴 수 있게 하는 규칙이 있음
		
		//정수 -> 실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
		
	}

}
