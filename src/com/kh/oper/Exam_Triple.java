package com.kh.oper;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String[] arg) {
		/*
		 *���׿�����
		 *�׸��� 3��
		 *(���ǽ�) ? ���϶� : �����϶�
		 * - ���ǽ��� �ݵ�� true or false
		 * - ��/�������� �ַ� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� �Է� : ");
		int num = sc.nextInt();
		// +, -, *, /, %
		// 4 / 2 == 2
		// 4 % 2 == 0
		String resultStr;
		resultStr = num % 2 == 0 ? "¦��" : "Ȧ��"; // ���̸� "¦��"�� resultStr ������ ��.
		System.out.println(num + "�� " + resultStr + "�Դϴ�.");
		
		
		
		
		
	}
}
