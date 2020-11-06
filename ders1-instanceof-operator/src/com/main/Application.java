package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("İsminizi giriniz:");
		String ad = scanner.nextLine();
		
		System.out.println("Soyisminizi giriniz:");
		String soyad = scanner.nextLine();
		
		
		String fullName = ad + " " + soyad;
		System.out.println("Tam Adı: " + fullName);
		
		System.out.println(fullName instanceof String);
		System.out.println(scanner instanceof Scanner);
		
		scanner.close();
	}

}
