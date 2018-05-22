import java.util.Scanner;

public class Zadanie2_7{
	public static void main(String args[]){
		
		System.out.println("Podaj pierwszą liczbę naturalną dodatnią");
		Scanner liczba1 = new Scanner(System.in);
		int twoja_liczba1 = liczba1.nextInt();
		
		System.out.println("Podaj drugą liczbę naturalną dodatnią");
		Scanner liczba2 = new Scanner(System.in);
		int twoja_liczba2 = liczba2.nextInt();
		
		System.out.print("NWD " + twoja_liczba1 + " i " + twoja_liczba2 + " to ");
		
		while (twoja_liczba1 != twoja_liczba2){
			if (twoja_liczba1 > twoja_liczba2)
				twoja_liczba1 -= twoja_liczba2;
			else
				twoja_liczba2 -= twoja_liczba1;
		}
		
		System.out.print(twoja_liczba1);
	}
}