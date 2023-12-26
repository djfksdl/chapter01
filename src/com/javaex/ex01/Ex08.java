package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		double v01 = 5/4; // 정수 나누기 정수라 실수로 착각할수있지만 정수다! 이게 실수 제일 많음!!
		System.out.println(v01);

		double v02 = (double)5/4;
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5 /(double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		
		int v06 = (int)(1.3 +1.8);
		System.out.println(v06);
		
//		int v07 = (int)1.3 + 1.8;
//		System.out.println(v07);
		
		double v08 = (int)1.3 + 1.8;
		System.out.println(v08);
		
		 
	}

}
