package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		//변수는 보통 맨위에 한군데로 모아준다.
		
		int i = 12345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String str = "안녕하세요"; 
		String name = "이연수";
		String hello = "굿모닝";
		
		System.out.println(i);
		System.out.println(12345);
		
		System.out.println(str); // 메모리 공간에 들어있는것
		System.out.println("안녕하세요"); // 한번만 쓸거면 굳이 공간을 만들 필요가 없으니 바로 넣기
		

		System.out.print(name);
		System.out.println(str);
		
		System.out.println("-------------------");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("-------------------");
		System.out.println(hello + hello);
		System.out.println(name + hello + hello);
		System.out.println(name +"님 "+ hello + " "+ hello);
		System.out.println("제 이름은 " + name + "입니다.");
		
		System.out.println("-------------------");
		System.out.println(i+i);
		System.out.println(d+d);
		System.out.println(i+d);
		System.out.println(c+c); //문자가 아닌 숫자로 연산된다.-> 그래서 String을 함
		System.out.println(s+s);
		
		System.out.println(name + i + d); //숫자로 연산된다.
		
		System.out.println("-------------------");
		System.out.println("안녕\"하\"세요");// 안녕"하"세요
		System.out.println("안녕\\하\\세요");// 안녕\하\세요
		System.out.println("안녕\n하세요"); // 줄바꿈 기호(아마 new라인 이런뜻)
		System.out.println("안녕\t하세요");// 안녕	하세요
		
	}
}
