package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("X sayısını giriniz:");
		int x = scanner.nextInt();
		
		System.out.println("Y sayısını giriniz:");
		int y = scanner.nextInt();
		
		String currentResult = "X: " + x + " Y: " + y;
		System.out.println(currentResult);
		
		
		int temp = 0;
		
		temp = x;
		x = y;
		y = temp;
		
		currentResult = "X: " + x + " Y: " + y;
		System.out.println(currentResult);
		
		scanner.close();
		
	}

}
