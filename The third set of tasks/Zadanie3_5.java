import java.util.Scanner;
import java.util.Random;

public class Zadanie3_5{
	public static void main(String args[]){
		System.out.print("Podaj liczbę losowań: ");
		Scanner liczba =new Scanner(System.in);
		int n=liczba.nextInt();
		
		for (int i=0;i<n;i++){
			int a[]=new int[49];
			int wynik[]=new int[6];
			
			for (int j=0;j<49;j++){
				a[j]=j+1;
			}
		
		
			int liczba_wyl=0;
			System.out.println("Oto wyniki " + (i+1) + " losowania:");
			
			while (liczba_wyl<6){
				Random r=new Random();
				int k=r.nextInt(49);
				if (a[k] != 0){
					wynik[liczba_wyl]=a[k];
					System.out.print(wynik[liczba_wyl] + ", ");
					a[k]=0;
					liczba_wyl++;
				}
			}
			System.out.println();
		}
	}
}