package com.kh.exercise;

import java.util.Scanner;

public class Exercise_Triple2 {
	// �� ���� '+' �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
	// ��, '+', '-' �̿��� ������ �Է½� "�߸��Է��ϼ̽��ϴ�!" ���

	// ù��° �� : 6
	// �ι�° �� : 12
	// ������ �Է�(+ or -) : +
	// ��� : 18

	// ù��° �� : 6
	// �ι�° �� : 12
	// ������ �Է�(+ or -) : -
	// ��� : -6
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("ù��° �� : ");
	int a = sc.nextInt();
	System.out.print("�ι�° �� : ");
	int b = sc.nextInt();
	System.out.print("������ �Է�(+ or -) : ");
	char operator = sc.next().charAt(0);
	
	String result = (operator == '+') ? a+b+"" : (operator == '-') ? a-b+"" : "�߸��Է��ϼ̽��ϴ�!"; // ������� int�� int�� ����ȯ ���������, Sting.valueof(a+b) or a+b+""
	System.out.println("��� : " + result);
	
	// ���׿����ڿ��� () ���� �Ⱦ��� ������� �򰥸��� ()����
}
}

		