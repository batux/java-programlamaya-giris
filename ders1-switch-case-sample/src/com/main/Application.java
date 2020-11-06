package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayi1 giriniz");
		double sayi1 = scanner.nextDouble();
		
		System.out.println("sayi2 giriniz");
		double sayi2 =scanner.nextDouble();
		
		
		System.out.println("1- Çıkarma");
		System.out.println("2- Toplama");
		System.out.println("3- Bölme");
		System.out.println("4- Çarpma");
		
		int kullaniciTercihi = scanner.nextInt();
		
		switch (kullaniciTercihi) {
		
			case 1:
				// çıkarma
				System.out.println(sayi1 - sayi2);
				break;
			case 2:
				// toplama
				System.out.println(sayi1 + sayi2);
				break;
			case 3:
				// bölme
				
				if(sayi2 == 0)
				{
					System.out.println("Payda (sayi2) değeri sıfır olamaz!");
				}
				else
				{
					System.out.println(sayi1 / sayi2);
				}
				break;
			case 4:
				// çarpma
				System.out.println(sayi1 * sayi2);
				break;
	
			default:
				System.out.println("Geçersiz işlem!");
				break;
		}
		
		scanner.close();
	}
}
