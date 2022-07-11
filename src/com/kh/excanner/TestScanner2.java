package com.kh.excanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) {
		// 입력받은 것 중에서 정수를 입력받았습니다.
		// 실수, 문자, 문자열 입력 받아보겠습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int iNum = sc.nextInt();
		
		System.out.print("실수를 입력해주세요 : ");
		double dNum = sc.nextDouble();
		
		 sc.nextLine( ); // nextLine 앞에는 nextLine을 한번 더 써주기
		System.out.print("문자열을 입력해주세요 : ");
		String inputStr = sc.nextLine(); // nextLine() 문자열을 받는데 차이가 있어요
		                             // sc.next : 공백을 안받음, sc.nextLine : 공백까지 받음
		System.out.print("문자를 입력해주세요 : ");
		char inputChar = sc.next().charAt(0); //nextChar() 없다
		
		System.out.println("입력한 정수는 : " + iNum);
		System.out.println("입력한 실수는 : " + dNum);
		System.out.println("입력한 문자열은 : " + inputStr);
		System.out.println("입력한 문자는 : " + inputChar);
		
	}
}
