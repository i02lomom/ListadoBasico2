/**
 * Define la clase MortadeloYFilemon que muestre 5 veces el mensaje Mortadelo y
 * Filemon. Realízalo usando el decremento y los tres bucles for, while y do..while.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MortadeloYFilemon{
	public static void main(String[] args){
		int i =5;

		System.out.println("\nCon while\n");
		while (i>0){
			System.out.println("Mortadelo y Filemon");
			i--;
		}

		i=5;

		System.out.println("\nCon do..while\n");
		do{
			System.out.println("Mortadelo y Filemon");
			i--;
		}while(i>0);

		System.out.println("\nCon for\n");
		for (i=5;i>0;i--)
			System.out.println("Mortadelo y Filemon");
	}
}
