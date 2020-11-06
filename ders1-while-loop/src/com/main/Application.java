package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		String sifre = "12345";
		Scanner scanner = new Scanner(System.in);
		boolean sifreDogrumu = false;
		
		while(!sifreDogrumu)
		{
			
			System.out.println("Şifrenizi giriniz");
			String girilenSifre = scanner.next();
			
			if(sifre.equals(girilenSifre))
			{
				sifreDogrumu = true;
				System.out.println("Giriş işlemi başarılı, anasayfaya yönlendiriliyorsunuz");
			}
			
		}
		
		
		scanner.close();
	}
	
}
