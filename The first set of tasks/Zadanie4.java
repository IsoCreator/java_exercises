import java.util.Scanner;
public class Zadanie4{
public static void main(String args[]){
		
float a,b;
String wybor;
		
System.out.print("Podaj pierwszy bok:");
Scanner liczba1=new Scanner(System.in);
a=liczba1.nextFloat();
System.out.print("Podaj drugi bok:");
Scanner liczba2=new Scanner(System.in);
b=liczba2.nextFloat();

if ( a>0 && b>0){
	System.out.print("Co liczbymy: P-pole, O-obwód: ");
	Scanner wyb=new Scanner(System.in);
	wybor=wyb.nextLine();
	if ("P".equals(wybor)) // equals do porównania dwóch string'ów
		System.out.println("Pole wynosi " + (a*b));
	else if ("O".equals(wybor))
		System.out.println("Obwód wynosi " + (2*a+2*b));
	else
		System.out.println("Blędny wybór");
	}
	
else System.out.println("Boki nie są dodatnie!");
}
}