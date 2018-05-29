import java.util.Scanner;
public class Zadanie3_9{
	public static void main(String args[]){
		
		System.out.print("Podaj napis: ");
		Scanner lancuch=new Scanner(System.in);
		String napis=lancuch.nextLine();
		
		int i=0;
		while (napis.charAt(i) == napis.charAt(napis.length()-i-1) && i<napis.length()/2)
			i++;
		
		if (i == napis.length()/2)
			System.out.println("To jest palindrom.");
		else
			System.out.println("To nie jest palindrom.");
	}
}