import java.util.Scanner;

public class Zadanie5_3{
	
	public static float zlota_rek(int n){
		if(n==1){
			return 1;
		}
		
		return 1 + 1/zlota_rek(n-1);
	}

	public static float zlota_ite(int n){
        float liczba=0;
        if(n==1)
            return 1;
		
		float poprzednia = zlota_ite(n-1);
		for(int i=1;i<n;i++){
            liczba=1+1/poprzednia;
            
		}
		poprzednia = liczba;
		return liczba;
	}
	
	public static void wyswietl(int n, String s){
	    if(s.equals("R")){
	        System.out.println("Rekurencyjnie");
			for(int i=1;i<=n;i++){
				System.out.println(zlota_rek(i));
			}
	    }else if(s.equals("I")){
	        System.out.println("Iteracyjnie");
			for(int i=1;i<=n;i++){
				System.out.println(zlota_ite(i));
			}
		}else
			System.out.println("Bledne dane!");
		
	}
	
	public static void main(String args[]){
		
		Scanner liczba = new Scanner(System.in);
		int n = liczba.nextInt();

		System.out.println("Podaj sposob (rekurencyjnie - R / iteracyjnie - I)");
		Scanner sposob = new Scanner(System.in);
		String s = sposob.nextLine();
		
		wyswietl(n,s);
	}
}