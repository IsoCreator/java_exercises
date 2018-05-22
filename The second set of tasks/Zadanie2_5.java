import java.util.Scanner;

public class Zadanie2_5{
	public static void main(String args[]){
		
		System.out.println("Podaj dodatnią liczbę całkowitą.");
		
		Scanner liczba = new Scanner(System.in);
		int twoja_liczba = liczba.nextInt();
		
		int i=1;
		
		if (twoja_liczba > 0){
			System.out.println("Dzielniki twojej liczby to:");
			while (twoja_liczba >= i){
				if (twoja_liczba % i == 0){
					System.out.println(i);
				}
				i=i+1;
			}
		}else
			System.out.println("Bląd! Zla liczba!");
	}
}