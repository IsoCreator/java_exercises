import java.util.Scanner;
public class Zadanie3_8{
	public static void main(String args[]){
		
		System.out.print("Podaj napis: ");
		Scanner lancuch=new Scanner(System.in);
		String napis=lancuch.nextLine();
		
		String samogloski="aAąĄeEiIoOóÓuUyY";
		
		System.out.println("Oto samogloski w Twoim napisie: ");

		for (int i=0;i<napis.length();i++){
			for (int j=0;j<samogloski.length();j++){
				if (napis.charAt(i) == samogloski.charAt(j)){
					System.out.println(napis.charAt(i));
					break;
				}
			}
		}
		
		String napis2="";
		for (int i=napis.length()-1;i>=0;i--){
			napis2+=napis.charAt(i);
		}
		System.out.println("Napis od końca: " + napis2);
	}
}