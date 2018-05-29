import java.util.Scanner;
public class Zadanie3_7{
	public static void main(String args[]){
		
		System.out.print("Podaj napis: ");
		Scanner lancuch=new Scanner(System.in);
		String napis=lancuch.nextLine();
		
		System.out.println("Oto trzyliterowe podslowa: ");
				
		for (int i=0;i<napis.length()-2;i++){
			String napis2="";
			for (int j=i;j<i+3;j++){
				napis2+=napis.charAt(j);
			}
			System.out.println(napis2);
		}
	}
}