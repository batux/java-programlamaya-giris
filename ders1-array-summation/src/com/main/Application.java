package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen dizinin boyutunu giriniz");
		int N = scanner.nextInt();
		
		int[] dizi1 = new int[N];
		int[] dizi2 = new int[N];
		
		for(int i = 0; i < dizi1.length; i++)
		{
			dizi1[i] = (int) (Math.random() * 100);
		}
		
		for(int i = 0; i < dizi1.length; i++)
		{
			dizi2[i] = (int) (Math.random() * 100);
		}
		
		
		int[] diziSonuc = new int[N];
		
		for(int i = 0; i < diziSonuc.length; i++)
		{
			diziSonuc[i] = dizi1[i] + dizi2[i];
		}
		
		for(int i = 0; i < diziSonuc.length; i++)
		{
			System.out.println(diziSonuc[i]);
		}
		
		scanner.close();
	}
}
