package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaça kadar toplama işlemi yapılacaktır?");
		int maxLimit = scanner.nextInt();
		
		int toplam = 0;
		
		for(int i=1; i <= maxLimit; i++)
		{
			toplam = toplam + i;
		}
		
		System.out.println("Toplam: " + toplam);
		
		scanner.close();
	}

}
