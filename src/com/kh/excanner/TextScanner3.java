package com.kh.excanner;

import java.util.Scanner;

public class TextScanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է����ּ���. : ");
		String name = sc.next();

		System.out.print("�¾ ���� �Է����ּ���. : ");
		int month = sc.nextInt();

		System.out.print("Ű�� �Է����ּ���. : ");
		int tall = sc.nextInt();

		System.out.print("������ �Է����ּ���. : ");
		char sex = sc.next().charAt(0);

		sc.nextLine(); // �ԷµǾ��� ���Ͱ��� ���� �� ***nextLine()�� ������ �������� �ٷ����� nextLine()�� �ѹ� ���ش� ��!!!
		System.out.print("�ּҸ� �Է����ּ���. : "); // �ּҸ� �Է� �޴´�.
		String address = sc.nextLine();
		// next(), nextLine() �Ѵ� ���ڿ��� �Է¹���
		// nextLine()�� ������ �Է¹���.

		System.out.println("�̸��� " + name + " �Դϴ�.");
		System.out.println("�¾���� " + month + "�� �Դϴ�.");
		System.out.println("�� Ű�� " + tall + " �Դϴ�.");
		System.out.println("������ " + sex + " �Դϴ�.");
		System.out.println("�ּ��� " + address + " �Դϴ�.");

	}
}
