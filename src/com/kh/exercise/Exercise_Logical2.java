package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	// �Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
	// ���� �ϳ� �Է����ּ��� : a
	// ���� �빮�� Ȯ�� : false

	// ���� �ϳ� �Է����ּ��� : A
	// ���� �빮�� Ȯ�� : true

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڰ��� �Է����ּ��� : ");
		char a = sc.next().charAt(0);
		
		boolean result = (a >= 65) && (a <= 90);    // �Ѵ� ����
	//	boolean result = (a >= 'A') && ( a <= 'Z');  // �Ѵ� ����
		System.out.println("�빮���ΰ�? :" + result);
		
				
	}
}
