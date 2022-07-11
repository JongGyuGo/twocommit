package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String[] args) {
		// 입력한 정수값이 1 ~ 100 사이의 숫자인지 확인하시오
		// 정수를 하나 입력해주세요 : 33
		// 1부터 100사이의 숫자인가? : true
		Scanner sc = new Scanner(System.in);

		System.out.print("정수값을 입력해주세요 : ");
		int a = sc.nextInt();

//		if (a <= 100) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		boolean result =(a > 1) && (a < 100);
		System.out.println("1부터 100사이의 숫자인가? :" + result);
		
		
	}
}


