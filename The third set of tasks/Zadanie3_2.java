public class Zadanie3_2{
	public static void main(String args[]){
		
		int pierwszy_wyraz = 10;
		int roznica = -6;
		int iloczyn = 1;
		
		System.out.println("Liczby: ");
		for (int i=pierwszy_wyraz;i>-30;i+=roznica){
			System.out.println(i);
			iloczyn*=i;
		}
		System.out.println("Iloczyn wynosi: " + iloczyn);
	}
}