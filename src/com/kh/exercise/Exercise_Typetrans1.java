package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Typetrans1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 하나 입력해주세요 :");
		int a = sc.nextInt();
		System.out.println("문자로 변환 : " + (char)a); //형변환 int -> char
		
	}
}
