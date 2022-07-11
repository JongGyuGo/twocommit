package com.kh.excanner;

import java.util.Scanner;

public class TextScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 클래스를 TestScanner에서 사용할거야

		System.out.print("int 첫번째값을 입력해주세요 : ");
		int input1 = sc.nextInt();
		System.out.print("int 두번째값을 입력해주세요 : ");
		int input2 = sc.nextInt();

		System.out.println("입력한 첫번째 값은 : " + input1);
		System.out.println("입력한 두번째 값은 : " + input2);

		int result = input1 + input2;
		System.out.println("두 값의 합은 : " + result + " 입니다.");
	}
}
