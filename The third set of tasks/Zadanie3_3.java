import java.util.Scanner;
public class Zadanie3_3{
	public static void main(String args[]){
		
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[3];
		int suma=0;
		
		System.out.println("Podaj wspórzędne pierwszego wektora");
		for (int i=0;i<3;i++){
			Scanner liczba=new Scanner(System.in);
			a[i]=liczba.nextInt();
		}
		System.out.println("Podaj wspórzędne drugiego wektora");
		for (int i=0;i<3;i++){
			Scanner liczba=new Scanner(System.in);
			b[i]=liczba.nextInt();
			c[i]=a[i] + b[i];
			suma+=a[i] * b[i];
		}
		System.out.println("Pierwszy wektor: [" + a[0] + "," + a[1] + "," + a[2] + "]");
		System.out.println("Drugi wektor: [" + b[0] + "," + b[1] + "," + b[2] + "]");
		System.out.println("Suma: [" + c[0] + "," + c[1] + "," + c[2] + "]");		
		
		if (suma==0)
			System.out.println("Wektory są prostopadle");
		else
			System.out.println("Wektory nie są prostopadle");
		if (a[1]*b[2] == b[1]*a[2] && a[0]*b[1] == b[0]*a[1] && a[0]*b[2] == b[0]*a[2])
			System.out.println("Wektory są równolegle");
		else
			System.out.println("Wektory nie są równolegle");
	}
}