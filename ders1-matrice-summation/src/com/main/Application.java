package com.main;

public class Application {

	public static void main(String[] args) {
		
		int[][] matris1 = new int[3][5];
		int[][] matris2 = new int[3][5];
		
		for(int satir = 0; satir < 3; satir++)
		{
			for(int sutun = 0; sutun < 5; sutun++)
			{
				matris1[satir][sutun] = (int) (Math.random() * 100);
			}
		}
		
		for(int satir = 0; satir < 3; satir++)
		{
			for(int sutun = 0; sutun < 5; sutun++)
			{
				matris2[satir][sutun] = (int) (Math.random() * 100);
			}
		}
		
		
		int[][] matrisSonuc = new int[3][5];
		
		for(int satir = 0; satir < 3; satir++)
		{
			for(int sutun = 0; sutun < 5; sutun++)
			{
				
				matrisSonuc[satir][sutun] = matris1[satir][sutun] + matris2[satir][sutun];
				
			}
		}
		
		
		for(int satir = 0; satir < 3; satir++)
		{
			for(int sutun = 0; sutun < 5; sutun++)
			{
				System.out.print(matrisSonuc[satir][sutun] + " ");
			}
			System.out.println();
		}
		
	}

}
