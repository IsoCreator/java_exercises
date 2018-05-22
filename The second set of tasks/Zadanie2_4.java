import java.util.Scanner;

public class Zadanie2_4{
	public static void main(String args[]){
		
		System.out.println("Podaj dodatnią liczbę całkowitą.");
		
		Scanner liczba = new Scanner(System.in);
		int twoja_liczba = liczba.nextInt();
		
		System.out.println("Liczby parzyste mniejsze od twojej liczby:");
		
		int i=0;
		if (twoja_liczba>0){
			while (i<twoja_liczba){
				System.out.println(i);
				i=i+2;
			}
		}else
			System.out.println("Bląd! Nieprawidlowa liczba!");
	}
}
