package com.kh.operator;

public class Exam_Unary {
	public static void main(String[] args) {

		// 1�� ����
		int a = 10;
		int b = 20;
		int c = 30;

		a++;  //11
		b = (--a) + b; //30 
		c = (a++) + (--b); //29 

		System.out.println("1�� ����");
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
		System.out.println("----------------");

		// 2�� ����
		boolean flag = true;
		System.out.println("2�� ����");
		System.out.println("����� : " + !!!!flag);
		System.out.println("----------------");

		// 3�� ����
		int x = 100;
		int y = 33;
		int z = 0;

		x--;
		z = x-- + --y;
		x = 99 + x++ + x; 
		y = y-- + y + ++y;

		System.out.println("3�� ����");
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);

	}
}
