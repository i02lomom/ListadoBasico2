/**
 * Entrega un programa ALaDeUna que muestre:
 * A la de 1... 
 * A la de 2... 
 * A la de 3....
 * Utilizando el bucle while, el do..while y el for
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class ALaDeUna{
	public static void main(String[] args){
		int i =1;

		System.out.println("\nCon while\n");
		while (i<4)
			System.out.println("A la de " + i++ + "...");

		i=1;

		System.out.println("\nCon do..while\n");
		do
			System.out.println("A la de " + i++ + "...");
		while(i<4);

		System.out.println("\nCon for\n");
		for (i=1;i<4;i++)
			System.out.println("A la de " + i + "...");
	}
}
