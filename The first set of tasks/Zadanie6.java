import java.util.Scanner;
import java.lang.Math;
import java.io.IOException;

public class Zadanie6{
	public static void main(String args[]) throws IOException, InterruptedException{
		float a, b, h;
		System.out.print("Podaj bok a:");
		Scanner bok_a = new Scanner(System.in);
		a = bok_a.nextFloat();
		
		System.out.print("Podaj bok b:");
		Scanner bok_b = new Scanner(System.in);
		b = bok_b.nextFloat();
		
		System.out.print("Podaj wysokoœæ:");
		Scanner wys = new Scanner(System.in);
		h = wys.nextFloat();
	
		double przek = Math.sqrt(Math.pow(h,2)+Math.pow((Math.sqrt(Math.pow(a,2)+Math.pow(b,2))),2));
		
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor(); // komenda do czyszczenia ekranu
		
		if( a>0 && b>0 && h>0 )
		{
			System.out.println("PPC: " + (2*a*b+2*b*h+2*a*h));
			System.out.println("V: " + (a*b*h));
			System.out.println("Przek¹tna: " + przek);
		}else System.out.println("B³êdne dane");
	}
	
	
}