package com.javaex.ex04;

public class Ex13 {
	public static void main(String[] args) {
		int i =1;
		
		boolean flag = true;
		
		while(flag) {
			if(i>3) {
				flag = false; // 다음에 못들어가게 함. break는 바로 튕겨나가는데 false에서 만족이 되면 다음줄것까지 다 하고나서 다음에 못들어가게 함. 
				//break;
			}
			
			System.out.println(i);
			i++;
		}
	}
}
