import java.util.Random;

public class Zadanie9{
public static void main(String args[]){

int a, b, c, d;

Random r = new Random();

a=r.nextInt(6)+1; // losuje liczby od 1 do 6
b=r.nextInt(6)+1;
c=r.nextInt(6)+1;
d=r.nextInt(6)+1;

int suma1 = a+b;
int suma2 = c+d;

System.out.println("Gracz 1 wyrzucil " + a + " oraz " + b);
System.out.println("Gracz 2 wyrzucil " + c + " oraz " + d);

if ( suma1>suma2) System.out.println("Wygrywa pierwszy");
else if ( suma1<suma2) System.out.println("Wygrywa drugi");
else System.out.println("Remis");
}	
}