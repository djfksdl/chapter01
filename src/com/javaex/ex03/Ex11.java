package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();
		char code = 'C';//로 해서 case 값에 문자열 넣어줘도됨
//		String code = e "C"도 가능!
		// 다른 자료형도 가능하다. long은 안됨 그냥 int나 String쓰는게 늘어나도 안전함
		
		switch(month) {
		
		case 1:{
			int num = 3; //{}치면 변수 넣어주고 다음 case안에 같은 변수 설정해줘도됨. {}안치면 같은 덩어리라고 인식해서 오류남
			System.out.println("31일");
			break;
		}
		case 2:{
			int num = 3; //그래서 {}안에 생기고 없어지는게 보기편할 때있어서 if문으로 써도 됨
			System.out.println("28일");
			break;
		}
		case 3: 
			System.out.println("31일");
			break; // 안써도 되긴하지만 안쓰면 3월을 입력했을때 4월까지의 결과가 나오게 됨. break는 그 구문을 빠져나가는 역할을 함
		case 4:
			System.out.println("30일");
			break;
		case 5:
			System.out.println("31일");
			break;
		case 6:
			System.out.println("30일");
			break;
		case 7:
			System.out.println("31일");
			break;
		case 8:
			System.out.println("31일");
			break;
		case 9:
			System.out.println("30일");
			break;
		case 10:
			System.out.println("31일");
			break;
		case 11:
			System.out.println("30일");
			break;
		case 12:
			System.out.println("31일");
			break;
			
			
		default:
			System.out.println("존재하지 않는 달입니다.");
			break;
			
// break가 하는 역할을 이용하여 반복되는 부분 줄이는 코드 : 근데 나아중에 다시 왔을떄 한꺼번에 떠오르지 않다면 좋은 코드는 아님
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("30일");
//			break;
//		case 2:
//			System.out.println("28일");
//			break;
//		default:
//			System.out.println("31일");
//			break;
			
		}
		
		sc.close();

	}

}
