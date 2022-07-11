package com.kh.operator;

public class Exam_Logical {
	public static void main(String[] args) {
		System.out.println("논리연산자 예제");
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		result1 = (a != b) && (a < b); // t && f -> f
		result2 = (a < b) || (a == b); // f || f -> f
		result3 = (a > b) && (a != b); // t && t -> t
		result4 = (a > b) || (a == b); // t || f -> t

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println();
		
		System.out.println("논리연산자 예제2");
		int aNum = 70;
		int bNum = 55;
		
		result1 = (aNum == bNum) || (aNum++ < 100); // true, aNum = 71, bNum = 55
		result2 = (aNum < bNum) && (--bNum < 55); // false, && X, aNum = 71, bNum = 55이다, 뒤에식은 볼 필요도 없기때문에 계산해주지 않는다.
		result3 = (aNum != bNum) && (bNum-- < aNum++); // true, aNum = 72, bNum = 54
		result4 = (aNum++ != bNum) || (bNum++ >= 85); // true, || X, aNum = 73, bNum = 54 
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("a의 값 : " + aNum + ", b의 값 : " + bNum);
		
		// 뒤에 식이 애초에 성립이 안되면 전위연산과 후위연산을 하지 않는다.
		
		
		
		
	}
}
