package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String[] args) {
		// �Է��� �������� 1 ~ 100 ������ �������� Ȯ���Ͻÿ�
		// ������ �ϳ� �Է����ּ��� : 33
		// 1���� 100������ �����ΰ�? : true
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� �Է����ּ��� : ");
		int a = sc.nextInt();

//		if (a <= 100) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		boolean result =(a > 1) && (a < 100);
		System.out.println("1���� 100������ �����ΰ�? :" + result);
		
		
	}
}


