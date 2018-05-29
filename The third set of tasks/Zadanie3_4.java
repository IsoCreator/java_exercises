import java.util.Scanner;
import java.util.Random;

public class Zadanie3_4{
	public static void main(String args[]){
		String tablica[] = new String[5];
		System.out.println("Podaj twoje przywitania: ");
		for (int i=0;i<5;i++){
			Scanner przywitanie =new Scanner(System.in);
			String przyw = przywitanie.nextLine();
			tablica[i] = przyw;
		}
		Random r=new Random();
		int liczba_wyl = r.nextInt(4)+1;

		System.out.println("Twoje wylosowane przywitanie: " + tablica[liczba_wyl]); 
	}
}