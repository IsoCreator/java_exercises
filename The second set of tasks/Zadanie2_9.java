import java.util.Scanner;

public class Zadanie2_9{
	public static void main(String args[]){
		
		System.out.println("Podaj ile mam wypisać liczb ciągu Fibbonaciego:");
		Scanner n = new Scanner(System.in);
		int liczba_n = n.nextInt();
		
		int i = 2;
		int suma = 0;
		int zm_pom1 = 0;
		int zm_pom2 = 1;
		System.out.println(suma);
		while ( i <= liczba_n){
			suma = zm_pom1 + zm_pom2;
			zm_pom1 = zm_pom2;
			zm_pom2 = suma;
			i = i+1;
			System.out.println(suma);
		}
		System.out.println("SUMA: " + suma);
	}
}