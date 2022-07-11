package com.kh.oper;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String[] arg) {
		/*
		 *삼항연산자
		 *항목이 3개
		 *(조건식) ? 참일때 : 거짓일때
		 * - 조건식은 반드시 true or false
		 * - 비교/논리연산자 주로 사용
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수의 값 입력 : ");
		int num = sc.nextInt();
		// +, -, *, /, %
		// 4 / 2 == 2
		// 4 % 2 == 0
		String resultStr;
		resultStr = num % 2 == 0 ? "짝수" : "홀수"; // 참이면 "짝수"가 resultStr 변수에 들어감.
		System.out.println(num + "는 " + resultStr + "입니다.");
		
		
		
		
		
	}
}
