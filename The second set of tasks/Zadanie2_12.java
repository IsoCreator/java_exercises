import java.util.Scanner;
public class Zadanie2_12{
	public static void main(String args[]){
		
		int n;;
		System.out.print("Podaj liczbê naturaln¹: ");
		Scanner liczba = new Scanner(System.in);
		n = liczba.nextInt();
		
		System.out.println("Oto rozkad liczby " + n + " na czynniki pierwsze");
		while( n!=1){
			int d=2;
			while(n%d != 0){
				d = d+1;
			}
			System.out.println(d);
			n = n/d;
		}
			
	}
}