import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class Zadanie4_7{
	public static void main(String args[]){
		
		List<Object> lista = new LinkedList<Object>();
		
		System.out.print("Podaj liczbę losowań: ");
		Scanner liczba = new Scanner(System.in);
		int n = liczba.nextInt();
		
		Random r = new Random();
		int suma = 0;
		
		for(int i=0; i<n;i++){
			int wylosowane = r.nextInt(1000)+1;
			lista.add(wylosowane);
			suma += (int)lista.get(i);
		}
		System.out.println("Lista: " + lista);
		
		if(lista.contains(333)){
			System.out.println("Element 333 istnieje.");
		}else
			System.out.println("Element nie 333 istnieje.");
		
		for (int i=0;i<lista.size()-1;i++){
			for (int j=0;j<lista.size()-i-1;j++){
				if ((int)lista.get(j) > (int)lista.get(j+1)){
					lista.add(j+2,(int)lista.get(j));
					lista.remove(j);
				}
			}
		}
		
		float mediana = 0;
		if(lista.size()%2 == 0){
			mediana = ((int)lista.get(lista.size()/2 -1) + (int)lista.get(lista.size()/2)) /2;
		}else
			mediana = ((int)lista.get(lista.size())+1)/2;
		
		System.out.println("Średnia wynosi: " + ((float)suma/lista.size()));
		System.out.println("Mediana wynosi: " + mediana);
		//System.out.println("Lista: " + lista);
	}
}