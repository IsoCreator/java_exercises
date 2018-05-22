import java.util.Scanner;
import java.lang.Math; // biblioteka matematyczna
import java.io.IOException; // biblioteka do czyszczenia ekranu

public class Zadanie5{
public static void main(String args[]) throws IOException, InterruptedException{ // throws ... zeby moc czyscic ekran

float r;
System.out.print("Podaj promieñ:");
Scanner pr=new Scanner(System.in);
r=pr.nextFloat();

new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor(); // komenda do czyszczenia ekranu

if ( r>0 ){
	System.out.println("Pole: " + (Math.PI * r * r));
	System.out.println("Obwód: " + (2 * Math.PI * r));
}else System.out.println("Bledny promieñ!");

}
}