package com.kh.excanner;

import java.util.Scanner;

public class TextScanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해주세요. : ");
		String name = sc.next();

		System.out.print("태어난 월을 입력해주세요. : ");
		int month = sc.nextInt();

		System.out.print("키를 입력해주세요. : ");
		int tall = sc.nextInt();

		System.out.print("성별을 입력해주세요. : ");
		char sex = sc.next().charAt(0);

		sc.nextLine(); // 입력되었던 엔터값을 받은 후 ***nextLine()을 쓸때는 쓰기전에 바로위에 nextLine()을 한번 써준다 꼭!!!
		System.out.print("주소를 입력해주세요. : "); // 주소를 입력 받는다.
		String address = sc.nextLine();
		// next(), nextLine() 둘다 문자열을 입력받음
		// nextLine()은 공백을 입력받음.

		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("태어난월은 " + month + "월 입니다.");
		System.out.println("제 키는 " + tall + " 입니다.");
		System.out.println("성별은 " + sex + " 입니다.");
		System.out.println("주소은 " + address + " 입니다.");

	}
}
