package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple1 {
	// 입력받은 정수가 양수, 0, 음수인지 판별 후 출력하세요..
	// 너무 어려우면 양수, 음수 판별부터 해보세요
	// 정수를 입력해주세요 : -1
	// -1은/는 음수입니다.

	// 정수를 입력해주세요 : 1
	// 1은/는 양수입니다.

	// 정수를 입력해주세요 : 0
	// 0은/는 0입니다.
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int a = sc.nextInt();

//		boolean result = a > 0;
//		String reultStr = a > 0 ? "양수" : "음수";
		
		String resultStr = a == 0? " 0 입니다." : a > 0 ? " 양수 입니다." : " 음수 입니다."; // 삼항연산자 중첩 *삼항연산자 복습 해야될듯
		System.out.println(a + "는"  + resultStr);

	}
}
