public class Zadanie3_1{
	public static void main(String args[]){
		
		int suma=0;
		System.out.println("Wyrazy ci�gu: ");
		for (int i=6;i<2000;i+=9){
			System.out.println(i);
			suma+=i;
		}
		System.out.println("Suma wyraz�w ci�gu wynosi " + suma);
	}
}