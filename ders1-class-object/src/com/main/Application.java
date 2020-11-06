package com.main;

public class Application {

	public static void main(String[] args) {
		
		MatrisOperasyonlar matrisOperasyonlar = new MatrisOperasyonlar(4, 8);
		
		MatrisOperasyonlar matrisOperasyonlar2 = new MatrisOperasyonlar(5, 5);
		
		
		int[][] matris1 = matrisOperasyonlar.rastgeleMatrisiDoldur();
		int[][] matris2 = matrisOperasyonlar.rastgeleMatrisiDoldur();
		
		int[][] sonucMatris = matrisOperasyonlar.matrisToplama(matris1, matris2);
		
		matrisOperasyonlar.matrisiEkranaYazdir(sonucMatris);
	}

}
