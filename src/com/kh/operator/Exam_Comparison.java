package com.kh.operator;

public class Exam_Comparison {
	public static void main(String[] args) {
		System.out.println("비교연상자 예제");
		// 비교연산자 : 두 값을 비교하는 연산자, 관계연산자
		// 비교연산자는 조건을 만족하면 true, 아니면 false를 반환함.
		int a = 50;
		int b = 30;
		boolean result;
		result = a < b;
		System.out.println("(a < b)의 결과 : " + result);
		result = a > b;
		System.out.println("(a > b)의 결과 : " + result);
		result = (a == b);
		System.out.println("(a == b)의 결과 : " + result);
		result = (a != b);
		System.out.println("(a != b)의 결과 : " + result);

		// 짝수홀수 판별 프로그램
		int num = 2;
		result = num % 2 == 0; // 2로 나눠서 0이 나오면 짝수, 1이 나오면 홀수
		System.out.println("짝수인가요? : " + result);
	}
}