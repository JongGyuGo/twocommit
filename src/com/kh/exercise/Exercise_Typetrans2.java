package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Typetrans2 {
	public static void main(String[] args) {
		int a = 3;
		double b = 2.2;
		double result = a + b;
		System.out.println(result);
		System.out.println((int)result); // 강제형변환 5.2 -> 5
	}
}
