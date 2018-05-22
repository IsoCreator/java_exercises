import java.util.Scanner;
public class Zadanie{
public static void main(String args[]){
	
int a,b;

System.out.print("Podaj pierwsz¹ liczbê: ");
Scanner liczba1=new Scanner(System.in);
a=liczba1.nextInt();

//System.out.print("Podaj drug¹ liczbê: ");
//Scanner liczba2=new Scanner(System.in);
//b=liczba2.nextInt();
double potega2 = Math.pow(a, 2);
double potega3 = Math.pow(a, 3);
int c = a%4;
if(c == 0 )
{
	System.out.println("Liczba jest podzielna przez 4!");
}else
{
	System.out.println("Liczba nie jest podzielna przez 4!");
}
double d = potega3 - 5*a + 4;
System.out.println("x^3 - 5x + 4 = 0");
if(d == 0 )
{
	System.out.println("Wprowadzona liczba jest rozwi¹zaniem tego równania!");
}else
{
		System.out.println("Wprowadzona liczba nie jest rozwi¹zaniem tego równania!");
}
//System.out.println(a+" + "+b+" = " +(a+b));
System.out.println(a + "^2 = " + potega2);
System.out.println(a + "^3 = " + potega3);
//System.out.println("Hello world"); dodanie ln przechodzi do nowej lini
//System.out.print(123);
	
}
}