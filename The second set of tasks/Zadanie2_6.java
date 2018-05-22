import java.util.Scanner;

public class Zadanie2_6{
	public static void main(String args[]){
		
		System.out.println("Podaj pierwszą liczbę naturalną dodatnią");
		Scanner liczba1 = new Scanner(System.in);
		int twoja_liczba1 = liczba1.nextInt();
		
		System.out.println("Podaj drugą liczbę naturalną dodatnią");
		Scanner liczba2 = new Scanner(System.in);
		int twoja_liczba2 = liczba2.nextInt();
		
		int wieksza = 0;
		int mniejsza = 0;
		
		if (twoja_liczba1 > twoja_liczba2){
			wieksza = twoja_liczba1;
			mniejsza = twoja_liczba2;
		}else{
			wieksza = twoja_liczba2;
			mniejsza = twoja_liczba1;
		}
		
		int i = 1;
		int wynik = 1;
		
		while (wynik % mniejsza != 0){
			wynik = wieksza * i;
			i = i+1;
		}
		System.out.println("NNW " + wieksza + " i " + mniejsza + " wynosi " +wynik);
	}
}