import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Zadanie3{
public static void main(String args[]){
	
List<String> lista=new LinkedList<String>();


for(int i =0; i <= 10; i++){
	
	System.out.print("Podaj kolejnego pracownika: ");
	Scanner prac=new Scanner(System.in);
	String pracownik=prac.nextLine();
	lista.add(pracownik);
	
}	
lista.add(2, "Andrzej Kalicki");
System.out.println("Bieżąca liczba pracowników: "+lista);
Collections.sort(lista);
System.out.println("Po sortowaniu "+lista);
int dl = 11;
int i = 0;
while(i<dl){
	if(lista.get(i).charAt(0) == 'B'){
		lista.remove(i);
		dl--;
	}
	else{
		i++;
	}
	System.out.print("Lista po usunięciu pracowników: "+lista);
}
	
}
}