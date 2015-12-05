/**
 * Entrega un programa ALaDeTres que muestre:
 * A la de 3... 
 * A la de 2... 
 * A la de 1....
 * Utilizando el bucle while, el do..while y el for
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class ALaDeTres{
	public static void main(String[] args){
		int i =3;

		System.out.println("\nCon while\n");
		while (i>0)
			System.out.println("A la de " + i-- + "...");

		i=3;

		System.out.println("\nCon do..while\n");
		do
			System.out.println("A la de " + i-- + "...");
		while(i>0);

		System.out.println("\nCon for\n");
		for (i=3;i>0;i--)
			System.out.println("A la de " + i + "...");
	}
}
