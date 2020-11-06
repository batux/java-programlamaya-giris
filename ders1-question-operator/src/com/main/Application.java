package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir tamsayı giriniz");
		int sayi = scanner.nextInt();
		
		int absSayi = (sayi < 0) ? (-1 * sayi) : sayi;
		System.out.println(absSayi);
		
		scanner.close();
	}

}
