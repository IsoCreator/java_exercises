import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Zadanie4_1{
	public static void main(String args[]){
		
		List<Object> lista = new LinkedList<Object>(); //tworzenie listy
		
		long iloczyn = 1;
		
		for (int i=0;i<10;i++){
			System.out.println("Podaj kolejny element");
			Scanner li = new Scanner(System.in);
			int liczba = li.nextInt();
			lista.add(liczba); // add sluzy do dodania elementu na koniec listy
			iloczyn*=(int)lista.get(i); // get sluzy do pobierania i-tego elementu w liscie
		}
		System.out.println("Twoja lista: " + lista);
		System.out.println("Iloczyn elementów to: " + iloczyn);
		
		int min = (int)lista.get(0);
		
		for (int i=1;i<10;i++){
			if ((int)lista.get(i)<min)
				min = (int)lista.get(i);
		}
		System.out.println("Element minimalny to: " + min);
		int dl = 10;
		int i = 0;
		while (i<dl){
			if ((int)lista.get(i) == 3){
				lista.add(i,1);
				lista.remove(i+1);
				i++;
			}// kasowanie elementów z listy, super zadanko na koloska :)
			else if ((int)lista.get(i) == 2){
				lista.remove(i);
				dl--;
			}else
				i++;
		}
		System.out.println("Twoja lista: " + lista);
	}
}