package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	
		String kullaniciTercihi = "E";
		
		while("E".equals(kullaniciTercihi))
		{
			
			System.out.println("Bölünecek sayıyı giriniz");
			int sayi1 = scanner.nextInt();
			
			
			System.out.println("Bölen sayıyı giriniz");
			int sayi2 = scanner.nextInt();
			
			int bolum = 0;
			
			while( sayi1 >= sayi2 )
			{
				sayi1 = sayi1 - sayi2;
				bolum = bolum + 1;
			}
			
			System.out.println("Bölüm: " + bolum);
			System.out.println("Kalan: " + sayi1);
			
			
			System.out.println("İşleme devam etmek için E'ye basınız");
			kullaniciTercihi = scanner.next();
		}
		
		System.out.println("Program çalışması sonlandırıldı");
		
		scanner.close();
	}

}
