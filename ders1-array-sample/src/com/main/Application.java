package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] numberArray = new double[10];
		
		// dizi elemanlarını klavyeden giriyoruz
		for(int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = scanner.nextDouble();
		}
		
		// dizi elemanlarının değerlerini değiştiriyoruz
		for(int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = numberArray[i] * 2;
		}
		
		// dizi elemanlarınu tek tek ekranda gösteriyoruz.
		for(int i = 0; i < numberArray.length; i++)
		{
			System.out.println(numberArray[i]);
		}
		
		
		scanner.close();
	}

}
