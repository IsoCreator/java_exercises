import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Zadanie2_3{
public static void main(String args[])
{

int n;
System.out.println("Czy umiesz mnozyc?");


int i = 0;
int wynik = 0;

while(i<10){
	Random r = new Random();
	int losowana1 = r.nextInt(9)+2;
	int losowana2 = r.nextInt(9)+2;
	System.out.println(losowana1 +" * " +losowana2);
	System.out.println("Jaki wynik?");
	Scanner liczba = new Scanner(System.in);
	n=liczba.nextInt();
	if(n==(losowana1*losowana2)){
	wynik = wynik +1;}
	i=i+1;
	
}
System.out.println("Wynik to "+wynik);



}

	
}