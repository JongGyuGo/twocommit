package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple1 {
	// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ����ϼ���..
	// �ʹ� ������ ���, ���� �Ǻ����� �غ�����
	// ������ �Է����ּ��� : -1
	// -1��/�� �����Դϴ�.

	// ������ �Է����ּ��� : 1
	// 1��/�� ����Դϴ�.

	// ������ �Է����ּ��� : 0
	// 0��/�� 0�Դϴ�.
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� : ");
		int a = sc.nextInt();

//		boolean result = a > 0;
//		String reultStr = a > 0 ? "���" : "����";
		
		String resultStr = a == 0? " 0 �Դϴ�." : a > 0 ? " ��� �Դϴ�." : " ���� �Դϴ�."; // ���׿����� ��ø *���׿����� ���� �ؾߵɵ�
		System.out.println(a + "��"  + resultStr);

	}
}
