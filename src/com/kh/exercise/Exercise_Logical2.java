package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	// 입력한 문자 값이 대문자인지 확인하여 결과 출력하기
	// 문자 하나 입력해주세요 : a
	// 영어 대문자 확인 : false

	// 문자 하나 입력해주세요 : A
	// 영어 대문자 확인 : true

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자값을 입력해주세요 : ");
		char a = sc.next().charAt(0);
		
		boolean result = (a >= 65) && (a <= 90);    // 둘다 가능
	//	boolean result = (a >= 'A') && ( a <= 'Z');  // 둘다 가능
		System.out.println("대문자인가? :" + result);
		
				
	}
}
