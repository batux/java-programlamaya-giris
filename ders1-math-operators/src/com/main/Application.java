package com.main;

public class Application {

	public static void main(String[] args) {
		
		int a = 80;
		int b = 90;
		
		
		int toplamSonuc = a + b;
		int cikarmaSonuc = a - b;
		int bolmeSonuc = a / b;
		int carpmaSonuc = a * b;
		int modSonuc = b % a;
		
		System.out.println(  toplamSonuc  );
		System.out.println(  cikarmaSonuc  );
		System.out.println(  bolmeSonuc  );
		System.out.println(  carpmaSonuc  );
		System.out.println(  modSonuc  );
		
		//System.out.println(a++);
		//System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		
		
		System.out.println(Math.sin(100.2));
		System.out.println(Math.ceil(100.2));
		System.out.println(Math.floor(100.2));
		System.out.println(Math.random());

	}

}
