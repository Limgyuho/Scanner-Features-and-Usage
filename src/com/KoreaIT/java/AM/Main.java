package com.KoreaIT.java.AM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		
		//스캐너 타입의 sc라는 변수를 만들고 스캐너객체를 만들어서 연결한다
		Scanner sc = new Scanner(System.in);
	
		System.out.println("명령어) ");
		
//		String cmd  = sc.nextLine();
		//문장에 공백을 사용한다고 해도 공백을 포함하여 문장 전체가 나온다
//		String cmd = sc.next();
		//공백이 발생하기 전 까지의 문장을 보여준다
		int cmd = sc.nextInt();
		//입력받은 정수를 보여주며 공백을 사용하면 공백전까지만 보여준다
		System.out.println("입력된명령어 > " + cmd );
		
		System.out.println("==프로그램 종료==");
	
	
	
	}

}
