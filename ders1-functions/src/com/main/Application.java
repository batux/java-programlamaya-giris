package com.main;

public class Application {

	public static void main(String[] args) {
		
		
		int[][] matris1 = rastgeleMatrisiDoldur( 5, 5 );
		int[][] matris2 = rastgeleMatrisiDoldur( 5, 5 );
		
		matrisiEkranaYazdir(matris1, 5, 5);
		matrisiEkranaYazdir(matris2, 5, 5);
		
		
		int[][] sonucMatrisi = matrisToplama(matris1, matris2, 5, 5);
		matrisiEkranaYazdir(sonucMatrisi, 5, 5);
		
		
		int[][] matris3 = rastgeleMatrisiDoldur( 5, 5 );
		int[][] sonucMatrisi2 = matrisToplama(sonucMatrisi, matris3, 5, 5);
		matrisiEkranaYazdir(sonucMatrisi2, 5, 5);
	}
	
	public static int[][] matrisToplama(int[][] matris1, int[][] matris2, int satirmax, int sutunmax)
	{
		int[][] matrisSonuc = new int[satirmax][sutunmax];
		
		for(int satir = 0; satir < satirmax; satir++)
		{
			for(int sutun = 0; sutun < sutunmax; sutun++)
			{
				
				matrisSonuc[satir][sutun] = matris1[satir][sutun] + matris2[satir][sutun];
				
			}
		}
		
		return matrisSonuc;
	}
	
	public static int[][] rastgeleMatrisiDoldur(int satirmax, int sutunmax)
	{
		int[][] matris = new int[satirmax][sutunmax];
		
		for(int satir = 0; satir < satirmax; satir++)
		{
			for(int sutun = 0; sutun < sutunmax; sutun++)
			{
				matris[satir][sutun] = (int) (Math.random() * 100);
			}
		}
		
		return matris;
	}

	public static void matrisiEkranaYazdir(int[][] matris, int satirmax, int sutunmax)
	{
		
		for(int satir = 0; satir < satirmax; satir++)
		{
			for(int sutun = 0; sutun < sutunmax; sutun++)
			{
				System.out.print(matris[satir][sutun] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
	}
	
}
