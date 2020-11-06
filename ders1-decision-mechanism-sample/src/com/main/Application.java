package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Bir sayı giriniz");
		int sayi = scanner.nextInt();
		
		if(sayi > 50)
		{
			System.out.println("Sayı 50'dan büyüktür");
		}
		else if(sayi <= 50 && sayi > 25)
		{
			System.out.println("Sayı 50'dan küçük, 25'ten büyüktür.");
		}
		else if(sayi <= 25 && sayi > 15)
		{
			System.out.println("Sayı 25'dan küçük, 15'ten büyüktür.");
		}
		else
		{
			System.out.println("Sayı 10'dan küçüktür");
		}
		
		
		if(sayi < 10)
		{
			
		}
		else if(sayi < 20)
		{
			
		}
		else if(sayi < 30)
		{
			
		}
		
		scanner.close();
		

	}

}
