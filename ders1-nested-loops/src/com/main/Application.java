package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Döngü limitini giriniz");
		int N =  scanner.nextInt();
		
		int T = 0;
		
		for(int i = 1; i <= N; i++)
		{
			
			
			for(int j = 1; j <= N; j++)
			{
				
				T = T + i + j;
				
			}
			
			
		}
		
		System.out.println("T: " + T);
		
		scanner.close();
	}

}
