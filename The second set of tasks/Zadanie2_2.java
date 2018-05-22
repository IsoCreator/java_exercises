import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Zadanie2_2{
public static void main(String args[])
{

int n;
System.out.print("Ile liczb");
Scanner liczba = new Scanner(System.in);
n=liczba.nextInt();

int i = 0;
int suma = 0;
long iloczyn = 1;

while(i<n){
	Random r = new Random();
	int losowana = r.nextInt(8)+1;
	System.out.println("Wylosowano "+losowana);
	suma = suma + losowana;
	iloczyn = iloczyn*losowana;
	i=i+1;
}
System.out.println("Suma to "+suma);
System.out.println("Iloczyn to "+iloczyn);

}

	
}