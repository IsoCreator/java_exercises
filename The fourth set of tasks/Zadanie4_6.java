import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class Zadanie4_6{
	public static void main(String args[]){
		
		System.out.print("Podaj liczbę losowań: ");
		Scanner liczba = new Scanner(System.in);
		int n = liczba.nextInt();
		
		for(int k=1;k<=n;k++){
		
			List<Object> lista = new LinkedList<Object>();
			
			for(int i=1;i<=49;i++){
				lista.add(i);
			}

			List<Object> lista2 = new LinkedList<Object>();
			
			Random r = new Random();
			
			for(int j=1;j<=6;j++){
				int wylosowana=r.nextInt(lista.size());
				lista2.add(lista.get(wylosowana));
				lista.remove(wylosowana);
			}
			System.out.println("Lista nr " + k + ": " + lista2);
		}
	}
}