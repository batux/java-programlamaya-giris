package com.main;

public class Application {

	public static void main(String[] args) {
	
		/*
		 * 
		 * 1- 10 elemanlık rastgele sayılardan oluşan bir dizi tanımlayın.
		 * 2- bu dizi içerisindeki çift sayıları ekrana yazdırın.
		 * 
		 */
		
		
		int[] dizi = new int[10];
		
		for(int i = 0; i < dizi.length; i++)
		{
			dizi[ i ] = (int) (Math.random() * 100);
		}
		
		for(int i = 0; i < dizi.length; i++)
		{
			// çift sayı bulmaca
			if(dizi[i] % 2 == 0)
			{
				System.out.println(dizi[i]);
			}
		}
		
	}

}
