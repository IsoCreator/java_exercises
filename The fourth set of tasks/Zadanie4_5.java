import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Zadanie4_5{
	public static void main(String args[]){
		
		System.out.print("Podaj n: ");
		Scanner ni = new Scanner(System.in);
		int n = ni.nextInt();
		System.out.print("Podaj m: ");
		Scanner mi = new Scanner(System.in);
		int m = mi.nextInt();
		
		List<List<Object>> lista1 = new LinkedList<List<Object>>();
		
		for (int i=0;i<n;i++){
			List<Object> lista_wew1 = new LinkedList<Object>();
			lista1.add(lista_wew1);
			
			for (int j=0;j<m;j++){
				System.out.print("Podaj element " + (i+1) + " " + (j+1) + " macierzy ");
				Scanner li = new Scanner(System.in);
				int liczba = li.nextInt();
				lista_wew1.add(liczba);
			}
		}
		
		List<List<Object>> lista2 = new LinkedList<List<Object>>();
		
		for (int i=0;i<n;i++){
			List<Object> lista_wew2 = new LinkedList<Object>();
			lista2.add(lista_wew2);
			
			for (int j=0;j<m;j++){
				System.out.print("Podaj element " + (i+1) + " " + (j+1) + " macierzy ");
				Scanner li = new Scanner(System.in);
				int liczba = li.nextInt();
				lista_wew2.add(liczba);
			}
		}
		
		System.out.println("Twoje macierze:");
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				System.out.print(lista1.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				System.out.print(lista2.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		
		int cos;
		
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				cos = (int)lista2.get(i).get(j) + (int)lista1.get(i).get(j);
				System.out.print(cos + "\t");
			}
			System.out.println();
		}
	}
}