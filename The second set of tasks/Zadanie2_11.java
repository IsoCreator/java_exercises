import java.util.Scanner;
public class Zadanie2_11{
	public static void main(String args[]){
		
		int n;
		System.out.print("Podaj liczbê naturaln¹: ");
		Scanner liczba = new Scanner(System.in);
		n = liczba.nextInt();
		
		long iloczyn = 1;
		int i=n;
		while( i>1 ){
			iloczyn = iloczyn*i;
			i=i-2;
		}
	System.out.println(n + "!!= " + iloczyn);
	}
}