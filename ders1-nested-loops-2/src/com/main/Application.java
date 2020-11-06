package com.main;

public class Application {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 1;
		
		for(int i = 1; i <= 6; i = i + 4)
		{
			a = i * 2;
			
			for(int j = 5; j >= 0; j = j - 4)
			{
				
				if( i != j)
				{
					a = a + i;
				}
				else
				{
					b = b + j;
				}
				
			}
			
			b = a - i;
		}
		
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}

}
