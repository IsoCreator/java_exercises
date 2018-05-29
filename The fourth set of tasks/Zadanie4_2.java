import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public class Zadanie4_2{
	public static void main(String args[]){
		
		List<Object> lista = new LinkedList<Object>();
		int suma = 0;
		for (int i=0;i<100;i++){
			Random r = new Random();
			//int liczba = r.nextInt(b-a+1)+a; losowanie liczb z przedzialu (a,b)
			int liczba = r.nextInt(101)-50;
			lista.add(liczba);
			suma+=(int)lista.get(i);
		}
		System.out.println("Twoja lista " + lista);
		System.out.println("Suma elementów: " + suma);
		System.out.println("Ujemne elementy:");
		
		for (int i=0;i<100;i++){
			if ((int)lista.get(i)<0)
				System.out.println(lista.get(i));
		}
		
		// sortowanie bąbelkowe (XD)
		for (int i=0;i<99;i++){
			for (int j=0;j<99-i;j++){
				if ((int)lista.get(j) > (int)lista.get(j+1)){
					lista.add(j+2,(int)lista.get(j));
					lista.remove(j);
				}
			}
		}
		System.out.println("Lista po uporządkowaniu: " + lista);
		System.out.println("Element maksymalny to: " + lista.get(99));
		
		for (int i=0;i<10;i++){
			Random r = new Random();
			int liczba = r.nextInt(41)-20;
			lista.add(liczba);
		}
		System.out.println("Lista po modyfikacji: " + lista);
		
	}
}