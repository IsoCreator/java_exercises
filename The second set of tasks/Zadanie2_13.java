import java.util.Scanner;
public class Zadanie2_13{
	public static void main(String args[]){
		
		int n;
		char symbol,symbol2;
		System.out.print("Podaj liczb� naturaln�: ");
		Scanner liczba = new Scanner(System.in);
		n = liczba.nextInt();
		
		System.out.print("Podaj znak: ");
		Scanner znak = new Scanner(System.in);
		symbol = znak.next().charAt(0); // WPROWADZANIE CHAR'�W
		
		int i = 1;
		while( i<= n ){
			int j = 1;
			while( j <= n ){
				System.out.print(symbol + "  ");
				j = j+1;
			}
			System.out.println();
			System.out.println();
			i = i+1;
		}
	}
}