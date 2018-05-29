import java.util.Scanner;
public class Zadanie3_6{
	public static void main(String args[]){
		
		String napis;
		System.out.print("Podaj napis: ");
		Scanner lancuch=new Scanner(System.in);
		napis=lancuch.nextLine();
		
		System.out.println("Twój napis: " + napis);
		
		String napis2="";
		
		for (int i=0;i<napis.length();i++){
			if ('a' == napis.charAt(i))
				napis2+="7";
			else if ('d' == napis.charAt(i))
				napis2+="1";
			else if ('f' == napis.charAt(i))
				napis2+="9";
			else 
				napis2+=napis.charAt(i);
		}
		System.out.println("Napis po zmianie: " + napis2);
	}
}