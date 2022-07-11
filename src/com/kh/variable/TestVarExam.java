package com.kh.variable;

public class TestVarExam {
	public static void main(String[] args) {
		// 자료형별 변수를 만들고 -> int, num, char, boolean
		// 초기화 한 후 -> num = 1; char = a;
		// 그 값을 출력해라 -> System.out.println( )
		
		int iNum = 100; // 선언과 초기화 같이 하고 있음
		long lNum = 99990000000l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char ch = 'A';
		String fStr = "Hello World";
		boolean result = false;
		
//		System.out.println("정수의 값 : " + iNum);
//		System.out.println(lNum);
//		System.out.println(fNum);
//		System.out.println(dNum);
//		System.out.println(ch);
//		System.out.println(fStr);
//		System.out.println(result);//	
		
		System.out.println("Hello"+'q');
		System.out.println("Hello"+3.14);
		System.out.println(10+20+"Hello");
		System.out.println(10+"Hello"+20);
		System.out.println("Hello"+10);
		System.out.println(10+"Hello");
		System.out.println(10+(20+"Hello"));
		
		final int AGE = 20;
		System.out.println(AGE);
		
		int a = 1;
		int b = a++;
		int c = ++a;
		
		
		System.out.println(b);
		System.out.println(c);
		
	
		
		
	    
	}
}
