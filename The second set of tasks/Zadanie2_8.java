import java.util.Scanner;
public class Zadanie2_8{
	public static void main(String args[]){
		int n;
		System.out.print("Podaj liczbê naturaln¹: ");
		Scanner liczba = new Scanner(System.in);
		n = liczba.nextInt();
		
		System.out.println("Oto liczby pierwsze mniejsze od " + n);
		
		int i=2;
		while( i<n ){
			int d = 2;
			while(i%d != 0){
				d = d+1;
			}
			if(i==d)
				System.out.println(i);
			i=i+1;
		}
	}
}