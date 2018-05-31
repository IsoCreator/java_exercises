import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Zadanie4_4{
	public static void main(String args[]){
		
		List<List<Object>> lista = new LinkedList<List<Object>>(); //deklaracja listy(macierzy) dwuwymiarowej
		
		for (int i=0;i<2;i++){
			List<Object> lista_wew = new LinkedList<Object>();
			lista.add(lista_wew); //dodanie podlisty do listy
			
			for (int j=0;j<2;j++){
				System.out.print("Podaj element " + (i+1) + " " + (j+1) + " macierzy ");
				Scanner li = new Scanner(System.in);
				int liczba = li.nextInt();
				lista_wew.add(liczba);
			}
		}
		
		System.out.println("Twoja macierz:");
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				System.out.print(lista.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		
		int wyznacznik = (int)lista.get(0).get(0) * (int)lista.get(1).get(1) - (int)lista.get(0).get(1) * (int)lista.get(1).get(0);
		System.out.println("Wyznacznik macierzy: " + wyznacznik);
	}
}