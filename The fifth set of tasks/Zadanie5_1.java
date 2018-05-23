import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.lang.Math;

public class Zadanie5_1{

public static float obj(float a, float b, float c) {return a*b*c;}
public static float pole(float a, float b, float c) {return 2*(a*b+a*c+b*c);}
public static float prz(float a, float b, float c) {return (float)Math.sqrt(a*a+b*b+c*c);}

public static void main(String args[]){
	float a,b,c;
	System.out.print("Podaj a:");
	Scanner kr1 = new Scanner(System.in);
	a = kr1.nextFloat();
	
	System.out.print("Podaj b:");
	Scanner kr2 = new Scanner(System.in);
	b = kr2.nextFloat();
	
	System.out.print("Podaj c:");
	Scanner kr3 = new Scanner(System.in);
	c = kr3.nextFloat();
	
	System.out.println(obj(a,b,c));
	System.out.println(pole(a,b,c));
	System.out.println(prz(a,b,c));
}
}