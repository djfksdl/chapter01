package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		double[] dArray = new double[3]; // 개수를 안정해주면 오류가 난다.
		
		dArray[0] = 3.5;
		dArray[1] = 7.2;
		dArray[2] = 12.8; // 다른 자료형 내용을 넣으면 오류가 난다. 그러나 정수는 들어감. why? 4.0으로 자동형변환이 되어 들어간다.
		//값을 안넣고 부르면 기본값0으로 들어간다.
		
		//1개만 사용
		System.out.println(dArray[1]);
		
		// 모두 사용
		for(int i=0;i<dArray.length; i++ ) {
			System.out.println(dArray[i]);
		}

	}

}
