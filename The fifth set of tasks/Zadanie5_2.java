import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.lang.Math;

public class Zadanie5_2{
	public static void opis(){System.out.println("Program wypisujący dzielniki");}
	
	public static void dzielniki(int n){
		if (n<1)
			System.out.println("Bledne dane!");
		else{
			int size = 0;
			List<Object> dzielniki = new LinkedList<Object>();
			for (int i=1;i<=(int)Math.sqrt(n);i++){
				if (n%i == 0 && i != n/1){
					dzielniki.add(size,i);
					dzielniki.add(size+1,n/i);
					size++;
				}
				else if (n%i == 0){
					dzielniki.add(size,i);
					size++;
				}
			}
			System.out.println(dzielniki);
		}
	}
	
	public static void main(String args[]){
		
		opis();
		System.out.print("Podaj n:");
		Scanner ni = new Scanner(System.in);
		int n = ni.nextInt();
		dzielniki(n);
	}
}