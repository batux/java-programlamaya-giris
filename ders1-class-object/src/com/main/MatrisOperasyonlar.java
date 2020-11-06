package com.main;

public class MatrisOperasyonlar 
{
	private int satirmax;
	private int sutunmax;
	
	
	public MatrisOperasyonlar(int satir, int sutun)
	{
		this.satirmax = satir;
		this.sutunmax = sutun;
	}
	
	
	public int[][] matrisToplama(int[][] matris1, int[][] matris2)
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
	
	public int[][] rastgeleMatrisiDoldur()
	{	
		int[][] matris = new int[this.satirmax][sutunmax];
		
		for(int satir = 0; satir < satirmax; satir++)
		{
			for(int sutun = 0; sutun < sutunmax; sutun++)
			{
				matris[satir][sutun] = (int) (Math.random() * 100);
			}
		}
		
		return matris;
	}

	public void matrisiEkranaYazdir(int[][] matris)
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
