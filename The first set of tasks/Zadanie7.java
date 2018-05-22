import java.util.Scanner;
import java.lang.Math;
import java.io.IOException;

public class Zadanie7{
	public static void main(String args[]) throws IOException, InterruptedException{
		float a, b, c;
		
		System.out.print("Podaj wspó³czynnik a:");
		Scanner wart_a = new Scanner(System.in);
		a = wart_a.nextFloat();
		
		System.out.print("Podaj wspó³czynnik b:");
		Scanner wart_b = new Scanner(System.in);
		b = wart_b.nextFloat();
		
		System.out.print("Podaj wspó³czynnik c:");
		Scanner wart_c = new Scanner(System.in);
		c = wart_c.nextFloat();

		System.out.println("Dzia³nie: " + a + "x^2" + " + " + b + "x" + " + " + c );

		double delta = Math.pow(b,2) * 4 * a * c;
		
		if( delta == 0 ){
			System.out.println("x = " + (b * (-1) / 2 * a));
		}else if( delta > 0 ){
			System.out.println("x1 = " + ((b * (-1) - Math.sqrt(delta)) / 2 * a));
			System.out.println("x2 = " + ((b * (-1) + Math.sqrt(delta)) / 2 * a));
		}else{
			System.out.println("Pierwiastki zespolone");
		}
	}
}