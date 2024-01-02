package com.javaex.ex05;

public class Ex09 {

	//String args = new String[3] 자바가 올림
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 방의 값:" + args[i]);
		}
		
		//-h
		if(args[0].equals("-h")){
			System.out.println("[-h]:도움말");
			System.out.println("[-v]:버전정보");
			System.out.println("[-m]:만든사람");
		} else if(args[0].equals("-v")) {
			System.out.println("버전: 1.1");
		} else if(args[0].equals("-m")) {
			System.out.println("만든사람: 황일영");
		} else {
			System.out.println("옵션을 확인하세요");
		}

	}

}
