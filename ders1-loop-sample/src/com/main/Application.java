package com.main;

public class Application {

	public static void main(String[] args) {
		
		// 1'den 100'e kadar olan sayıların toplamanı bulan algoritma
		
		int toplam = 0;
		
		for(int sayi = 1; sayi <= 100; sayi = sayi + 1)
		{
			toplam = toplam + sayi;
		}
		
		double ortalama = toplam / 100.0;
		
		System.out.println(toplam);
		System.out.println(ortalama);
	}

}
