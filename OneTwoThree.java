package ListadoBasico2;
/**
 * Create the class OneTwoThree that displays:
 * At 1... 
 * At 2... 
 * At 3....
 * Using the loop while, do..while and for
 * Also use ++ in the counter
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class OneTwoThree{
	public static void main(String[] args){
		int i=0;

		System.out.println("\nWith while\n");
		while (i<3)
			System.out.println("At " + ++i + "...");

		i=0;

		System.out.println("\nWith do..while\n");
		do
			System.out.println("At " + ++i + "...");
		while(i<3);

		System.out.println("\nWith for\n");
		for (i=1;i<=3;)
			System.out.println("At " + i++ + "...");
	}
}
