package com.kh.operator;

public class Exam_Comparison {
	public static void main(String[] args) {
		System.out.println("�񱳿����� ����");
		// �񱳿����� : �� ���� ���ϴ� ������, ���迬����
		// �񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��.
		int a = 50;
		int b = 30;
		boolean result;
		result = a < b;
		System.out.println("(a < b)�� ��� : " + result);
		result = a > b;
		System.out.println("(a > b)�� ��� : " + result);
		result = (a == b);
		System.out.println("(a == b)�� ��� : " + result);
		result = (a != b);
		System.out.println("(a != b)�� ��� : " + result);

		// ¦��Ȧ�� �Ǻ� ���α׷�
		int num = 2;
		result = num % 2 == 0; // 2�� ������ 0�� ������ ¦��, 1�� ������ Ȧ��
		System.out.println("¦���ΰ���? : " + result);
	}
}