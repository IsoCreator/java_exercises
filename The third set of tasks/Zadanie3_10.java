import java.util.Scanner;
public class Zadanie3_10{
	public static void main(String args[]){
		
		System.out.print("Podaj napis: ");
		Scanner lancuch=new Scanner(System.in);
		String napis=lancuch.nextLine();
		
		System.out.println("Podaj literę: ");
		Scanner litera=new Scanner(System.in);
		String lit=litera.nextLine();
				
		String napis2="";
		
		for (int i=0;i<napis.length();i++){
			if (napis.charAt(i) != lit.charAt(0))
				napis2+=napis.charAt(i);
		}
		System.out.println("Napis po zmienie: " + napis2);
	}
}