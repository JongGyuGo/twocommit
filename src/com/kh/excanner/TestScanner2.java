package com.kh.excanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] args) {
		// �Է¹��� �� �߿��� ������ �Է¹޾ҽ��ϴ�.
		// �Ǽ�, ����, ���ڿ� �Է� �޾ƺ��ڽ��ϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int iNum = sc.nextInt();
		
		System.out.print("�Ǽ��� �Է����ּ��� : ");
		double dNum = sc.nextDouble();
		
		 sc.nextLine( ); // nextLine �տ��� nextLine�� �ѹ� �� ���ֱ�
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String inputStr = sc.nextLine(); // nextLine() ���ڿ��� �޴µ� ���̰� �־��
		                             // sc.next : ������ �ȹ���, sc.nextLine : ������� ����
		System.out.print("���ڸ� �Է����ּ��� : ");
		char inputChar = sc.next().charAt(0); //nextChar() ����
		
		System.out.println("�Է��� ������ : " + iNum);
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		System.out.println("�Է��� ���ڿ��� : " + inputStr);
		System.out.println("�Է��� ���ڴ� : " + inputChar);
		
	}
}
