import java.lang.Math;

public class Zadanie5_5{
	
	public static float ar(String args[]){
		float suma=0;
		for (int i=1;i<args.length;i++){
			// od 1, bo bedzie wywolywana 'A123', arg na miejscu 0 to A
			suma+=(float)Integer.valueOf(args[i]);
		}
		return suma/(args.length-1);
	}
	
	public static float geo(String args[]){
		float iloczyn=1;
		for (int i=1;i<args.length;i++){
			iloczyn*=(float)Integer.valueOf(args[i]);
		}
		return (float)Math.pow(iloczyn,1.0/(args.length-1));
	}
	
	public static void main(String args[]){
		if (args.length == 0)
			System.out.println("Brak argumentów!");
		else if (args.length>1 && "A".equals(args[0]))
			System.out.println("Średnia arytmetyczna: " + ar(args));
		else if (args.length>1 && "G".equals(args[0]))
			System.out.println("Średnia geometryczna: " + geo(args));
		else
			System.out.println("Bledny pierwszy argument lub nie podano liczb");
	}
}