package com.main;

public class Application {

	public static void main(String[] args) {
		
		
		for(int i=-100; i <= 1000; i++)
		{
			// tek sayıları buluyoruz
			if(i % 2 == -1 || i % 2 == 1) 
			{
				System.out.println("Tek sayı: " + i);
			}
		}
		
	}

}
